package com.api.taks.entity;

import jakarta.persistence.*;

@Entity
@Table(name="todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String decricao;
    private boolean realizacao;
    private int prioridade;

    public Todo(int prioridade, boolean realizacao, String decricao, String nome) {
        this.prioridade = prioridade;
        this.realizacao = realizacao;
        this.decricao = decricao;
        this.nome = nome;
    }

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

    public String getDecricao() {
        return decricao;
    }

    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    public boolean isRealizacao() {
        return realizacao;
    }

    public void setRealizacao(boolean realizacao) {
        this.realizacao = realizacao;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }


}
