package com.projetos.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb001_usuario")
public class UsuarioModel extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nu_usuario")
    public Long nuUsuario;
    @Column(name = "no_pessoa")
    public  String noPessoa;
    @Column(name = "no_usuario", unique = true)
    private String noUsuario;
    @Column(name = "co_senha")
    private  String coSenha;

}
