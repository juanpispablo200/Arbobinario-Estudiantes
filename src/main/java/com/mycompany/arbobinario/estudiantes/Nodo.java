/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbobinario.estudiantes;

/**
 *
 * @author Juan Pablo
 */
public class Nodo {
    Estudiante estudiante;
    Nodo izquierdo;
    Nodo derecho;

    public Nodo(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.izquierdo = null;
        this.derecho = null;
    }
}
 

