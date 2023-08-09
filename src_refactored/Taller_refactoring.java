/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller_refactoring;

import java.time.*;

/**
 *
 * @author ANDRES PORRAS
 */
public class Taller_refactoring {

    static SistemaAtencionMedico sistemaAtencionMedica;
    public static void main(String[] args) {
        inicializar();
        Persona paciente = sistemaAtencionMedica.obtenerPersona(sistemaAtencionMedica.getPersonas(),"Dario");
        ServicioMedico servicioMedico = sistemaAtencionMedica.obtenerServicioMedico("Psiquiatria");
        Persona medico = sistemaAtencionMedica.obtenerPersona(sistemaAtencionMedica.getPersonas(),"Nohelia");
        
        LocalDateTime dt = LocalDateTime.of( 2002,05,05,12,05);
        Consulta consulta = new Consulta(dt,(Paciente)paciente,(Medico)medico,servicioMedico);
        sistemaAtencionMedica.agendarConsulta((Paciente)paciente,consulta);
    }

    public static void inicializar(){
        sistemaAtencionMedica = new SistemaAtencionMedico();
        Paciente paciente = new Paciente("Dario",21,"Masculino","Floresta 2","0948759754","dlaborde@espol.edu.ec");
        Medico medico = new Medico("Nohelia",20,"Femenino","Duran","0991459625","nohePasaca@espol.edu.ec");
        ServicioMedico servicioMedico = new ServicioMedico("Psiquiatria","rama que trata problemas mentales",45.5,40);
        sistemaAtencionMedica.agregarPaciente(paciente);
        sistemaAtencionMedica.agregarMedico(medico);
        sistemaAtencionMedica.agregarServicioMedico(servicioMedico);
    }
}
