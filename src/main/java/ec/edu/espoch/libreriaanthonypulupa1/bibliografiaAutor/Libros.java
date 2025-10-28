/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec.edu.espoch.libreriaanthonypulupa1.bibliografiaAutor;

/**
 *
 * @author anthony
 */

public class Libros {

    private String titulo;
    private Autores autor;
    private String genero;
    private double precio;

    public Libros(String titulo, Autores autor, String genero, double precio) {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("El título del libro no puede estar vacío.");
        }
        if (autor == null) {
            throw new IllegalArgumentException("Debe asignarse un autor válido.");
        }
        this.titulo = titulo;
        this.autor = autor;
        this.genero = (genero == null || genero.isBlank()) ? "Desconocido" : genero;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autores getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return String.format("Título: %s | Autor: %s | Género: %s | Precio: $%.2f",
                titulo, autor.getNombre(), genero, precio);
    }
}
