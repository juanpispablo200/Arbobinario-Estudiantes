/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arbobinario.estudiantes;

/**
 *
 * @author Juan Pablo
 */
public class ArbobinarioEstudiantes {

    public static void main(String[] args) {
        
          ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
        arbol.agregarEstudiante(new Estudiante(123, "Arlette", 19));
        arbol.agregarEstudiante(new Estudiante(456, "Anderson ", 22));
        arbol.agregarEstudiante(new Estudiante(789, "Leonardo", 21));
        arbol.agregarEstudiante(new Estudiante(780, "Kevin", 23));
        Estudiante estudianteBuscado = arbol.buscarEstudiante(456);
        if (estudianteBuscado != null) {
            System.out.println("Estudiante encontrado: " + estudianteBuscado.nombre);
        } else {
            System.out.println("Estudiante no encontrado.");
        }
        Estudiante estudianteActualizar = new Estudiante(123, " Arlette", 19);
        arbol.actualizarEstudiante(estudianteActualizar);
        arbol.eliminarEstudiante(456);
    
        
    }
}
