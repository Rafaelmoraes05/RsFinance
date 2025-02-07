package com.rsfinance.rsfinance.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @Column(name="criado_em", nullable = false, updatable = false)
    private LocalDate criadoEm = LocalDate.now();

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
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
