package br.data.model;

import lombok.Data;

/**
 *
 * @author Adroaldo Hygino Ferreira
 */
@Data
public class DadosEntrada {

    private String nome;
    private int valor1 = (int) (Math.random() * 100);
    private int valor2 = (int) (Math.random() * 100);
    private int resultado;
}
