package com.mycompany.taller_refactoring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SistemaAtencionMedico {
    private static final double DESCUENTO_ADULTO_MAYOR = 0.25; 

    private List<Paciente> pacientes;
    private List<Medico> medicos;
    private List<ServicioMedico> serviciosMedicos;

    public SistemaAtencionMedico() {
        this.pacientes = new ArrayList<>();
        this.medicos = new ArrayList<>();
        this.serviciosMedicos = new ArrayList<>();
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void agregarServicioMedico(ServicioMedico servicioMedico) {
        serviciosMedicos.add(servicioMedico);
    }
    
    public List<Persona> getPersonas(){
        List<Persona> personas = new ArrayList<>();
        personas.addAll(pacientes);
        personas.addAll(medicos);
        return Collections.unmodifiableList(personas);
    };
    public void agendarConsulta(Paciente paciente, Consulta consulta){
        double costoConsulta = consulta.getServicioMedico().getCosto();
        if(paciente.esAdultoMayor()) {
            costoConsulta = costoConsulta * DESCUENTO_ADULTO_MAYOR;
        }
        System.out.println("Se han cobrado "+ costoConsulta+ " dolares de su tarjeta de credito");
        paciente.getHistorialMedico().addConsultas(consulta); //Hacer esto ahora es correcto
    }

    // se puede parametrizar (obtener...)
    public Persona obtenerPersona(List<Persona> listaPersonas,String nombre) {
        for(Persona persona : listaPersonas){
            if (persona.getNombre().equals(nombre))
                return persona;
        }
        return null;
    }

    public ServicioMedico obtenerServicioMedico(String nombreServicio) {
        for(ServicioMedico servicioMedico : serviciosMedicos){
            if (servicioMedico.getNombre().equals(nombreServicio))
                return servicioMedico;
        }
        return null;
    }

   
}
