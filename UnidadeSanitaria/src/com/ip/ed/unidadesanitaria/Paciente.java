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
public class Paciente extends Pessoa {
    private double peso;
    private Consulta consulta;

    public Paciente(String nome, String sobrenome, int idade, int id, double peso) {
        super(nome, sobrenome, idade, id);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void printPaciente() {
        System.out.println(super.toString());
        System.out.println("Peso: " + this.peso);
    }

    public void setConsulta(Consulta consulta) {
    this.consulta = consulta;
    }

    public Consulta getConsulta() {
    return this.consulta;
}
}
