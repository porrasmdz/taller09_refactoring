package com.mycompany.taller_refactoring;

public class ServicioMedico {
    private String nombre;
    private String descripcion;
    private double costo;
    private int duracion;
    
    private static final double MIN_COSTO = 0; 
    private static final int MIN_DURACION = 0; 

    public ServicioMedico(String nombre, String descripcion, double costo, int duracion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        // Ojo que las dos asignaciones de abajo deben de tener logica de validacion en el setter, esos valores no pueden ser negativos
        setCosto(costo);
        setDuracion(duracion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        if(costo<MIN_COSTO){
            System.out.println("El costo no puede ser menor a 0");
            return;
        }
        this.costo = costo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        if(duracion < MIN_DURACION)
        {
            return;
        }
        this.duracion = duracion;
    }
}
