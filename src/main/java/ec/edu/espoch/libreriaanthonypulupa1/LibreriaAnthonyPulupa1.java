/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.libreriaanthonypulupa1;

import ec.edu.espoch.libreriaanthonypulupa1.bibliografiaAutor.Autores;
import ec.edu.espoch.libreriaanthonypulupa1.bibliografiaAutor.Biblioteca;
import ec.edu.espoch.libreriaanthonypulupa1.bibliografiaAutor.Libros;

/**
 *
 * @author anthony
 */

public class LibreriaAnthonyPulupa1 {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

    
        biblioteca.agregarLibro(new Libros("Cien años de soledad",
                biblioteca.obtenerAutorPorPosicion(0), "Realismo mágico", 29.90));
        biblioteca.agregarLibro(new Libros("La casa de los espíritus",
                biblioteca.obtenerAutorPorPosicion(1), "Novela", 19.50));
        biblioteca.agregarLibro(new Libros("Ficciones",
                biblioteca.obtenerAutorPorPosicion(2), "Cuentos", 15.00));
        biblioteca.agregarLibro(new Libros("La ciudad y los perros",
                biblioteca.obtenerAutorPorPosicion(3), "Novela", 22.75));
        biblioteca.agregarLibro(new Libros("El laberinto de la soledad",
                biblioteca.obtenerAutorPorPosicion(4), "Ensayo", 18.20));

     
        biblioteca.mostrarLibros();

        System.out.println();
        System.out.println("° Sistema inicializado correctamente.");
        System.out.println("° Estructura estática: 5 autores predefinidos.");
        System.out.println("° Estructura dinámica: Catálogo de libros sin límite.");
    }
}
