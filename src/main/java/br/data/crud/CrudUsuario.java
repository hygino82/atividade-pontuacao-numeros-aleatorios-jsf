package br.data.crud;

import br.data.model.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adroaldo Hygino Ferreira
 */
public class CrudUsuario {

    public List<Usuario> getAll() {
        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuario(1, "Antonio"));
        listaUsuarios.add(new Usuario(2, "Maria"));
        listaUsuarios.add(new Usuario(3, "Julia"));
        listaUsuarios.add(new Usuario(4, "Roberto"));

        return listaUsuarios;
    }
}
