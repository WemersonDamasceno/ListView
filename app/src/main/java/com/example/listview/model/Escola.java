package com.example.listview.model;

public class Escola {
    private String nome;
    private String endereco;

    public Escola(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Escola() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
