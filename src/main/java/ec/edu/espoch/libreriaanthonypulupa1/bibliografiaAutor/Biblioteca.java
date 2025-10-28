/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec.edu.espoch.libreriaanthonypulupa1.bibliografiaAutor;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author anthony
 */

public class Biblioteca {

    private Autores[] autoresEstaticos;
    private List<Libros> catalogo;

    public Biblioteca() {
        
        autoresEstaticos = new Autores[5];
        autoresEstaticos[0] = new Autores("Gabriel García Márquez", "Colombiano");
        autoresEstaticos[1] = new Autores("Isabel Allende", "Chilena");
        autoresEstaticos[2] = new Autores("Jorge Luis Borges", "Argentino");
        autoresEstaticos[3] = new Autores("Mario Vargas Llosa", "Peruano");
        autoresEstaticos[4] = new Autores("Octavio Paz", "Mexicano");

        catalogo = new ArrayList<>();
    }

    public Autores[] getAutoresEstaticos() {
        return autoresEstaticos;
    }

    public void agregarLibro(Libros libro) {
        if (libro == null) {
            throw new IllegalArgumentException("No se puede agregar un libro nulo.");
        }
        catalogo.add(libro);
    }

    public void mostrarLibros() {
        System.out.println("=========================================");
        System.out.println("CATÁLOGO DE LIBROS - Total: " + catalogo.size());
        System.out.println("=========================================");

        if (catalogo.isEmpty()) {
            System.out.println("No hay libros registrados en la biblioteca.");
            return;
        }

        int i = 1;
        for (Libros l : catalogo) {
            System.out.printf("%d) %s%n", i++, l.toString());
        }
    }

    public Autores obtenerAutorPorPosicion(int pos) {
        if (pos < 0 || pos >= autoresEstaticos.length) {
            throw new IndexOutOfBoundsException("Posición de autor fuera de rango (0–4).");
        }
        return autoresEstaticos[pos];
    }
}


