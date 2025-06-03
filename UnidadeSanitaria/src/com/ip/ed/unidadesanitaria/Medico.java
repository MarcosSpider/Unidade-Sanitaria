/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ip.ed.unidadesanitaria;

/**
 *
 * @author Marcos
 */
public class Medico extends Pessoa {
    private String especialidade;
    private int numOrdem;

    public Medico(String nome,  String sobrenome, int idade, int id, String especialidade, int numOrdem) {
        super(nome, sobrenome, idade, id);
        this.especialidade = especialidade;
        this.numOrdem = numOrdem;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getNumOrdem() {
        return numOrdem;
    }

    public void setNumOrdem(int numOrdem) {
        this.numOrdem = numOrdem;
    }

    public void printMedico() {
        System.out.println(super.toString());
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("Nº Ordem: " + this.numOrdem);
    }
}
