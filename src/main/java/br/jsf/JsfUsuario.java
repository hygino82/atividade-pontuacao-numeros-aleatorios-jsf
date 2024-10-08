package br.jsf;

import br.data.crud.CrudUsuarioPontuacao;
import br.data.model.PontuacaoUsuario;
import br.ejb.EjbEntradaUsuario;
import br.ejb.EjbUsuario;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import lombok.*;

/**
 *
 * @author Adroaldo Hygino Ferreira
 */
@Named(value = "jsfUsuario")
@RequestScoped
public class JsfUsuario {

    @EJB
    private EjbUsuario ejbUsuario;

    @EJB
    private EjbEntradaUsuario ejbEntradaUsuario;

    @Getter
    @Setter
    private String nome;

    @Getter
    @Setter
    private int valor1 = (int) (Math.random() * 100);

    @Getter
    @Setter
    private int valor2 = (int) (Math.random() * 100);

    @Getter
    @Setter
    private int resultado;

    @Getter
    private boolean resultadoVerificacao;

    @Getter
    @Setter
    private String frase;

    private List<PontuacaoUsuario> lista;

    public void sortearValores() {
        valor1 = (int) (Math.random() * 100);
        valor1 = (int) (Math.random() * 100);
    }

    public void verificarSoma() {
        resultadoVerificacao = ejbEntradaUsuario.verificarResposta(valor1, valor2, resultado);
        ejbUsuario.adicionarPontuacaoUsuario(nome, resultadoVerificacao);
        lista = ejbUsuario.getAll();
        mudarFrase();
        sortearValores();
    }

    public void mudarFrase() {
        frase = (valor1 + valor2 == resultado) ? "Certo" : "Errado";
    }

    public List<PontuacaoUsuario> getLista() {
        return lista;
    }

    public JsfUsuario() {
    }
}
