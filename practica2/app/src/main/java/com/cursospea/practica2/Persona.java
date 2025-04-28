package com.cursospea.practica2;

public class Persona {
    protected String nombre;
    protected int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String mostrarInfo() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}
