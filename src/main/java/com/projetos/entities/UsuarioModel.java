package com.projetos.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

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

    public UsuarioModel() {
    }

    public UsuarioModel (String noPessoa, String noUsuario, String coSenha) {
        this.noPessoa = noPessoa;
        this.noUsuario = noUsuario;
        this.coSenha = coSenha;
    }

    public Long getNuUsuario() {
        return nuUsuario;
    }

    public void setNuUsuario(Long nuUsuario) {
        this.nuUsuario = nuUsuario;
    }

    public String getNoPessoa() {
        return noPessoa;
    }

    public void setNoPessoa(String noPessoa) {
        this.noPessoa = noPessoa;
    }

    public String getNoUsuario() {
        return noUsuario;
    }

    public void setNoUsuario(String noUsuario) {
        this.noUsuario = noUsuario;
    }

    public String getCoSenha() {
        return coSenha;
    }

    public void setCoSenha(String coSenha) {
        this.coSenha = coSenha;
    }
}
