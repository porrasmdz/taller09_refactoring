package com.mycompany.taller_refactoring;


import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

public class Consulta {
    private LocalDateTime dateTime;
    private Paciente paciente;
    private Medico medico;
    private ServicioMedico servicioMedico;
    private boolean realizada;
    
    private String diagnostico;
    private String tratamiento;
    private List<String> examenesMedicos;

    //CS1
    public Consulta(LocalDateTime dateTime, Paciente paciente, Medico medico, ServicioMedico servicioMedico) {
        this.dateTime = dateTime;
        this.servicioMedico = servicioMedico;
        this.paciente = paciente;
        this.medico = medico;
        this.realizada = false;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
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

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public List<String> getExamenesMedicos() {
        return Collections.unmodifiableList(examenesMedicos);
    }

    public void addExamenMedico(String examenMedico) {
        this.examenesMedicos.add(examenMedico);
    }    
    public void removeExamenMedico(String examenMedico) {
        this.examenesMedicos.remove(examenMedico);
    }


    public ServicioMedico getServicioMedico() {
        return servicioMedico;
    }

    public void setServicioMedico(ServicioMedico servicioMedico) {
        this.servicioMedico = servicioMedico;
    }
}
