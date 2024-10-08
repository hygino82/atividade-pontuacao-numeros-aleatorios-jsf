package br.ejb;

import br.data.crud.CrudUsuarioPontuacao;
import br.data.model.PontuacaoUsuario;
import java.util.List;
import javax.ejb.Stateful;

/**
 *
 * @author Adroaldo Hygino Ferreira
 */
@Stateful
public class EjbUsuario {

    private final CrudUsuarioPontuacao crudUsuarioPontuacao = CrudUsuarioPontuacao.getInstance();

    public void adicionarPontuacaoUsuario(String nome, boolean verificacao) {
        crudUsuarioPontuacao.adicionarPontuacaoUsuario(nome, verificacao);
    }

    public List<PontuacaoUsuario> getAll() {
        return crudUsuarioPontuacao.getLista();
    }
}
