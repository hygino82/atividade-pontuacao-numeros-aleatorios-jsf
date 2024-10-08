package br.data.crud;

import br.data.model.PontuacaoUsuario;
import br.data.model.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adroaldo Hygino Ferreira
 */
public class CrudUsuarioPontuacao {

    public static CrudUsuarioPontuacao instance;

    public static CrudUsuarioPontuacao getInstance() {
        if (instance == null) {
            instance = new CrudUsuarioPontuacao();
        }
        return instance;
    }

    private CrudUsuarioPontuacao() {
    }

    private List<PontuacaoUsuario> lista = new ArrayList<>();

    public void adicionarPontuacaoUsuario(String nome, boolean verificacao) {
        boolean usuarioEncontrado = false;

        for (PontuacaoUsuario pontuacaoUsuario : lista) {
            if ((pontuacaoUsuario.getUsuario().getNome().equalsIgnoreCase(nome))) {
                if (pontuacaoUsuario.getPontuacao() > 0) {
                    pontuacaoUsuario.setPontuacao(pontuacaoUsuario.getPontuacao() + 1);
                }
                usuarioEncontrado = true;
                break;
            }
        }
        if (!usuarioEncontrado) {
            int pontuacao = verificacao ? 1 : 0;
            PontuacaoUsuario pontuacaoUsuario = new PontuacaoUsuario(new Usuario(nome), pontuacao);
            lista.add(pontuacaoUsuario);
        }
    }

    public List<PontuacaoUsuario> getLista() {
        return lista;
    }
}
