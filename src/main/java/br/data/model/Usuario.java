package br.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Adroaldo Hygino Ferreira
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    private int codigo;
    private String nome;

}
