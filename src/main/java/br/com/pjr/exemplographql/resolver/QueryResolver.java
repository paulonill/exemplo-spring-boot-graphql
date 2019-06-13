package br.com.pjr.exemplographql.resolver;

import br.com.pjr.exemplographql.model.Usuario;
import br.com.pjr.exemplographql.repository.UsuarioRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QueryResolver implements GraphQLQueryResolver {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> usuarios() {
        List<Usuario> usuarios = repository.findAll();
        return usuarios;
    }
}