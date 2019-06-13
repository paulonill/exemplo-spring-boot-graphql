package br.com.pjr.exemplographql.repository;

import br.com.pjr.exemplographql.model.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    List<Usuario> findAll();
}