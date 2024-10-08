package br.ejb;

import br.data.crud.CrudUsuario;
import br.data.model.Usuario;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Adroaldo Hygino Ferreira
 */
@Stateless
public class EjbUsuario {

    public List<Usuario> getAll() {
        return new CrudUsuario().getAll();
    }
}
