package br.jsf;

import br.ejb.EjbEntradaUsuario;
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

    public void sortearValores() {
        valor1 = (int) (Math.random() * 100);
        valor1 = (int) (Math.random() * 100);
    }

    public void verificarSoma() {
        resultadoVerificacao = ejbEntradaUsuario.verificarResposta(valor1, valor2, resultado);
        sortearValores();
    }

    public JsfUsuario() {
    }
}
