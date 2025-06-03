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
public class Consulta {
    private int id;
    private Medico medico;
    private Paciente paciente;
    private String data; // Usa String por simplicidade, mas ideal seria LocalDate
    private String diagnostico;

    public Consulta(int id, Medico medico, Paciente paciente, String data, String diagnostico) {
        this.id = id;
        this.medico = medico;
        this.paciente = paciente;
        this.data = data;
        this.diagnostico = diagnostico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void printConsulta() {
        System.out.println("Consulta ID: " + id);
        System.out.println("Data: " + data);
        System.out.println("Paciente: " + paciente.getNome() + " " + paciente.getSobrenome());
        System.out.println("Médico: " + medico.getNome() + " (" + medico.getEspecialidade() + ")");
        System.out.println("Diagnóstico: " + diagnostico);
    }
}

