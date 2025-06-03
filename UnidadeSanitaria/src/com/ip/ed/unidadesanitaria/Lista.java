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
public class Lista {
    // Listas de Pacientes
    private Node primeiroPaciente;
    private Node ultimoPaciente;
    private int tamanhoPacientes;

    // Listas de Médicos
    private Node primeiroMedico;
    private Node ultimoMedico;
    private int tamanhoMedicos;

    // Listas de Consultas
    private Node primeiroConsulta;
    private Node ultimoConsulta;
    private int tamanhoConsultas;

    public Lista() {
        this.primeiroPaciente = null;
        this.ultimoPaciente = null;
        this.tamanhoPacientes = 0;

        this.primeiroMedico = null;
        this.ultimoMedico = null;
        this.tamanhoMedicos = 0;

        this.primeiroConsulta = null;
        this.ultimoConsulta = null;
        this.tamanhoConsultas = 0;
    }

    // ========= PACIENTES =========
    public boolean listaPacientesVazia() {
        return tamanhoPacientes == 0;
    }

    public int tamanhoPacientes() {
        return tamanhoPacientes;
    }

    public boolean adicionarPaciente(Paciente paciente) {
        Node novo = new Node(paciente);
        if (listaPacientesVazia()) {
            primeiroPaciente = ultimoPaciente = novo;
        } else {
            ultimoPaciente.setProximo(novo);
            novo.setAnterior(ultimoPaciente);
            ultimoPaciente = novo;
        }
        tamanhoPacientes++;
        return true;
    }

    public void imprimirPacientes() {
        if (listaPacientesVazia()) {
            System.out.println("Nenhum paciente cadastrado.");
            return;
        }
        Node atual = primeiroPaciente;
        while (atual != null) {
            atual.getPaciente().printPaciente();
            atual = atual.getProximo();
        }
    }
    public Paciente buscarPacientePorId(int id) {
    Node atual = primeiroPaciente;
    while (atual != null) {
        if (atual.getPaciente().getId() == id) {
            return atual.getPaciente();
        }
        atual = atual.getProximo();
    }
    return null;
}
    public boolean removerPacientePorId(int id) {
    Node atual = primeiroPaciente;

    while (atual != null) {
        if (atual.getPaciente().getId() == id) {
            if (atual == primeiroPaciente) {
                primeiroPaciente = atual.getProximo();
            }
            if (atual == ultimoPaciente) {
                ultimoPaciente = atual.getAnterior();
            }
            if (atual.getAnterior() != null) {
                atual.getAnterior().setProximo(atual.getProximo());
            }
            if (atual.getProximo() != null) {
                atual.getProximo().setAnterior(atual.getAnterior());
            }
            tamanhoPacientes--;
            return true;
        }
        atual = atual.getProximo();
    }
    return false;
}



    // ========= MÉDICOS =========
    public boolean listaMedicosVazia() {
        return tamanhoMedicos == 0;
    }

    public int tamanhoMedicos() {
        return tamanhoMedicos;
    }

    public boolean adicionarMedico(Medico medico) {
        Node novo = new Node(medico);
        if (listaMedicosVazia()) {
            primeiroMedico = ultimoMedico = novo;
        } else {
            ultimoMedico.setProximo(novo);
            novo.setAnterior(ultimoMedico);
            ultimoMedico = novo;
        }
        tamanhoMedicos++;
        return true;
    }

    public void imprimirMedicos() {
        if (listaMedicosVazia()) {
            System.out.println("Nenhum médico cadastrado.");
            return;
        }
        Node atual = primeiroMedico;
        while (atual != null) {
            atual.getMedico().printMedico();
            atual = atual.getProximo();
        }
    }
    public Medico buscarMedicoPorId(int id) {
    Node atual = primeiroMedico;
    while (atual != null) {
        if (atual.getMedico().getId() == id) {
            return atual.getMedico();
        }
        atual = atual.getProximo();
    }
    return null;
}
    public void buscarConsultasPorMedico(int idMedico) {
    Node atual = primeiroConsulta;
    boolean encontrou = false;

    while (atual != null) {
        if (atual.getConsulta().getMedico().getId() == idMedico) {
            atual.getConsulta().printConsulta();
            encontrou = true;
        }
        atual = atual.getProximo();
    }

    if (!encontrou) {
        System.out.println("Nenhuma consulta encontrada para o médico com ID " + idMedico);
    }
}



    // ========= CONSULTAS =========
    public boolean listaConsultasVazia() {
        return tamanhoConsultas == 0;
    }

    public int tamanhoConsultas() {
        return tamanhoConsultas;
    }

    public boolean adicionarConsulta(Consulta consulta) {
        Node novo = new Node(consulta);
        if (listaConsultasVazia()) {
            primeiroConsulta = ultimoConsulta = novo;
        } else {
            ultimoConsulta.setProximo(novo);
            novo.setAnterior(ultimoConsulta);
            ultimoConsulta = novo;
        }
        tamanhoConsultas++;
        return true;
    }

    public void imprimirConsultas() {
        if (listaConsultasVazia()) {
            System.out.println("Nenhuma consulta cadastrada.");
            return;
        }
        Node atual = primeiroConsulta;
        while (atual != null) {
            Consulta c = atual.getConsulta();
            System.out.println("ID: " + c.getId() + ", Paciente: " + c.getPaciente().getNome() +
                    ", Médico: " + c.getMedico().getNome() + ", Data: " + c.getData() +
                    ", Diagnóstico: " + c.getDiagnostico());
            atual = atual.getProximo();
        }
    }
    public Consulta buscarConsultaPorId(int id) {
    Node atual = primeiroConsulta;
    while (atual != null) {
        if (atual.getConsulta().getId() == id) {
            return atual.getConsulta();
        }
        atual = atual.getProximo();
    }
    return null;
}
    public void buscarConsultasPorPaciente(int idPaciente) {
    Node atual = primeiroConsulta;
    boolean encontrou = false;

    while (atual != null) {
        if (atual.getConsulta().getPaciente().getId() == idPaciente) {
            atual.getConsulta().printConsulta();
            encontrou = true;
        }
        atual = atual.getProximo();
    }

    if (!encontrou) {
        System.out.println("Nenhuma consulta encontrada para o paciente com ID " + idPaciente);
    }
}


}

