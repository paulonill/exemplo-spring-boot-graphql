package br.com.pjr.exemplographql.repository;

import br.com.pjr.exemplographql.model.Permissao;
import org.springframework.data.repository.CrudRepository;

public interface PermissaoRepository extends CrudRepository<Permissao,Long> {
}