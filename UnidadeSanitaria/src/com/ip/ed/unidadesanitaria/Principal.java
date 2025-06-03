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
public class Principal {
    public static void main(String[] args) {

        Lista lista = new Lista();


        Medico medico1 = new Medico("Geraldo", "Pedro", 001, 45, "Pediatra", 1);
        Medico medico2 = new Medico("Antonio", "sousa", 002, 41, "Pediatra", 2);
        lista.adicionarMedico(medico1);
        lista.adicionarMedico(medico2);


        Paciente paciente1 = new Paciente("Marcos", "Tchiwale", 23, 123, 70.5);
        Paciente paciente2 = new Paciente("Maria", "Pedro", 21, 102, 49.5);
        lista.adicionarPaciente(paciente1);
        lista.adicionarPaciente(paciente2);


        Consulta consulta1 = new Consulta(1, medico1, paciente1, "2025-06-02", "Gripe comum");
        paciente1.setConsulta(consulta1);
        lista.adicionarConsulta(consulta1);


        System.out.println("=== Médicos Cadastrados ===");
        lista.imprimirMedicos();

        System.out.println("\n=== Pacientes Cadastrados ===");
        lista.imprimirPacientes();

        System.out.println("\n=== Consultas Cadastradas ===");
        lista.imprimirConsultas();
    }
}
