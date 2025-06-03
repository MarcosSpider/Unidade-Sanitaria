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
public class Node {
    private Node proximo;
    private Node anterior;
    private Paciente paciente;
    private Medico medico;
    private Consulta consulta;

    public Node(Node proximo, Node anterior, Paciente paciente, Medico medico, Consulta consulta) {
        this.proximo = proximo;
        this.anterior = anterior;
        this.paciente = paciente;
        this.medico = medico;
        this.consulta = consulta;
    }
    
    public Node(Paciente paciente){
        this.paciente=paciente;
        this.proximo=null;
        this.anterior=null;
    }
    public Node(Consulta consulta){
        this.consulta=consulta;
        this.proximo=null;
        this.anterior=null;
    }
    public Node(Medico medico){
        this.medico=medico;
        this.proximo=null;
        this.anterior=null;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

    public Node getAnterior() {
        return anterior;
    }

    public void setAnterior(Node anterior) {
        this.anterior = anterior;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
    
    
}
