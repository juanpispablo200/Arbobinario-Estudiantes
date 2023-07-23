/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbobinario.estudiantes;

/**
 *
 * @author Juan Pablo
 */
public class ArbolBinarioBusqueda {

    private Nodo raiz;

    public ArbolBinarioBusqueda() {
        raiz = null;
    }

    // Método para agregar un estudiante al árbol
    public void agregarEstudiante(Estudiante estudiante) {
        raiz = agregarRecursivo(raiz, estudiante);
    }

    private Nodo agregarRecursivo(Nodo actual, Estudiante estudiante) {
        if (actual == null) {
            return new Nodo(estudiante);
        }

        if (estudiante.numeroIdentificacion < actual.estudiante.numeroIdentificacion) {
            actual.izquierdo = agregarRecursivo(actual.izquierdo, estudiante);
        } else if (estudiante.numeroIdentificacion > actual.estudiante.numeroIdentificacion) {
            actual.derecho = agregarRecursivo(actual.derecho, estudiante);
        }

        return actual;
    }

    // Método para buscar un estudiante por su número de identificación
    public Estudiante buscarEstudiante(int numeroIdentificacion) {
        return buscarRecursivo(raiz, numeroIdentificacion);
    }

    private Estudiante buscarRecursivo(Nodo actual, int numeroIdentificacion) {
        if (actual == null || actual.estudiante.numeroIdentificacion == numeroIdentificacion) {
            return (actual != null) ? actual.estudiante : null;
        }

        if (numeroIdentificacion < actual.estudiante.numeroIdentificacion) {
            return buscarRecursivo(actual.izquierdo, numeroIdentificacion);
        } else {
            return buscarRecursivo(actual.derecho, numeroIdentificacion);
        }
    }

    // Método para actualizar la información de un estudiante
    public void actualizarEstudiante(Estudiante estudiante) {
        raiz = actualizarRecursivo(raiz, estudiante);
    }

    private Nodo actualizarRecursivo(Nodo actual, Estudiante estudiante) {
        if (actual == null) {
            return null;
        }

        if (estudiante.numeroIdentificacion == actual.estudiante.numeroIdentificacion) {
            actual.estudiante = estudiante;
        } else if (estudiante.numeroIdentificacion < actual.estudiante.numeroIdentificacion) {
            actual.izquierdo = actualizarRecursivo(actual.izquierdo, estudiante);
        } else {
            actual.derecho = actualizarRecursivo(actual.derecho, estudiante);
        }

        return actual;
    }

    // Método para eliminar un estudiante por su número de identificación
    public void eliminarEstudiante(int numeroIdentificacion) {
        raiz = eliminarRecursivo(raiz, numeroIdentificacion);
    }

    private Nodo eliminarRecursivo(Nodo actual, int numeroIdentificacion) {
        if (actual == null) {
            return null;
        }

        if (numeroIdentificacion == actual.estudiante.numeroIdentificacion) {
            if (actual.izquierdo == null) {
                return actual.derecho;
            } else if (actual.derecho == null) {
                return actual.izquierdo;
            } else {
                actual.estudiante = encontrarMinimo(actual.derecho);
                actual.derecho = eliminarRecursivo(actual.derecho, actual.estudiante.numeroIdentificacion);
            }
        } else if (numeroIdentificacion < actual.estudiante.numeroIdentificacion) {
            actual.izquierdo = eliminarRecursivo(actual.izquierdo, numeroIdentificacion);
        } else {
            actual.derecho = eliminarRecursivo(actual.derecho, numeroIdentificacion);
        }

        return actual;
    }

    private Estudiante encontrarMinimo(Nodo nodo) {
        while (nodo.izquierdo != null) {
            nodo = nodo.izquierdo;
        }
        return nodo.estudiante;
    }
}
    

