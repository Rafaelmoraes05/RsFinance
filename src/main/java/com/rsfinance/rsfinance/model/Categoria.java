package com.rsfinance.rsfinance.model;

import java.time.LocalDate;
import java.util.List;

public class Categoria {

    private Long id;
    private String nome;
    private Usuario usuario;
    private LocalDate criadoEm;
    private List<Transacao> transacoes;

    //Getters e Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public LocalDate getCriadoEm() {
        return criadoEm;
    }
    public void setCriadoEm(LocalDate criadoEm) {
        this.criadoEm = criadoEm;
    }
    public List<Transacao> getTransacoes() {
        return transacoes;
    }
    public void setTransacoes(List<Transacao> transacoes) {
        this.transacoes = transacoes;
    }

}
