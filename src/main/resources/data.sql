insert into usuario (id, nome, email, ativo) values (1, 'João da Silva', 'joao@teste.com', true);
insert into usuario (id, nome, email, ativo) values (2, 'Maria Fernanda Gonçalves', 'maria@teste.com', true);

insert  into permissao (id, descricao, ativo) values (1, 'ROLE_INCLUIR', true);
insert  into permissao (id, descricao, ativo) values (2, 'ROLE_ALTERAR', true);
insert  into permissao (id, descricao, ativo) values (3, 'ROLE_EXCLUIR', true);
insert  into permissao (id, descricao, ativo) values (4, 'ROLE_CONSULTAR', true);

insert into usuario_permissao (id_usuario, id_permissao) values (1,1);
insert into usuario_permissao (id_usuario, id_permissao) values (1,2);
insert into usuario_permissao (id_usuario, id_permissao) values (1,3);
insert into usuario_permissao (id_usuario, id_permissao) values (1,4);

insert into usuario_permissao (id_usuario, id_permissao) values (2,4);
