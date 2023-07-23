/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbobinario.estudiantes;

/**
 *
 * @author Juan Pablo
 */
public class Estudiante {
    int numeroIdentificacion;
    String nombre;
    int edad;

    public Estudiante(int numeroIdentificacion, String nombre, int edad) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombre = nombre;
        this.edad = edad;
    }

        public int getNumeroIdentificacion() {
            return numeroIdentificacion;
        }

        public void setNumeroIdentificacion(int numeroIdentificacion) {
            this.numeroIdentificacion = numeroIdentificacion;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

   
}


