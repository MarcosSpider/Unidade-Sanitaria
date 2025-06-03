/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ip.ed.unidadesanitaria;

/**
 *
 * @author Marcos21
 */
public class Pessoa {
    protected String nome;
    protected String sobrenome;
    protected int idade;
    protected int id;

    public Pessoa(String nome, String sobrenome, int idade, int id) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.id=id;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "" + "nome=" + nome + "\nsobrenome=" + sobrenome + "\nidade=" + idade + "\nid=" + id;
    }
    
    
}
