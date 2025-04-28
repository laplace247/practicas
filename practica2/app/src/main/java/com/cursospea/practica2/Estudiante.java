package com.cursospea.practica2;

public class Estudiante extends Persona {
    private String matricula;

    // Constructor
    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad); // Llama al constructor de Persona
        this.matricula = matricula;
    }

    public String mostrarInfo() {
        return super.mostrarInfo() + ", Matrícula: " + matricula;
    }
}
