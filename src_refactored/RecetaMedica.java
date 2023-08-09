package com.mycompany.taller_refactoring;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

public class RecetaMedica {
    private LocalDateTime fechaHora;
    private Paciente paciente;
    private Medico medico;
    private List<String> medicamentos;

    public RecetaMedica(LocalDateTime fechaHora, Paciente paciente, Medico medico, List<String> medicamentos) {
        this.fechaHora = fechaHora;
        this.paciente = paciente;
        this.medico = medico;
        this.medicamentos = medicamentos;
    }

    public void agregarMedicamento(String medicamento) {
        medicamentos.add(medicamento);
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
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

    public List<String> getMedicamentos() {
        return Collections.unmodifiableList(medicamentos);
    }

    public void addMedicamento(String medicamento) {
        this.medicamentos.add(medicamento);
    }
    public void removeMedicamento(String medicamento) {
        this.medicamentos.remove(medicamento);
    }
}
