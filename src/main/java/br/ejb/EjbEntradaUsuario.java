package br.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author Adroaldo Hygino Ferreira
 */
@Stateless
public class EjbEntradaUsuario {

    public boolean verificarResposta(int valor1, int valor2, int resultado) {
        boolean res = valor1 + valor2 == resultado;
        return res;
    }
}
