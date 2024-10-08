package br.data.model;

/**
 *
 * @author Adroaldo Hygino Ferreira
 */
public class PontuacaoUsuario implements Comparable<PontuacaoUsuario> {

    private Usuario usuario;
    private int pontuacao;

    public PontuacaoUsuario(Usuario usuario, int pontuacao) {
        this.usuario = usuario;
        this.pontuacao = pontuacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    @Override
    public int compareTo(PontuacaoUsuario outro) {
        return Integer.compare(this.getPontuacao(), outro.getPontuacao());
    }
}
