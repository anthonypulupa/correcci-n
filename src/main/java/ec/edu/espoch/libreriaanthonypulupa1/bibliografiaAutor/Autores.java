/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec.edu.espoch.libreriaanthonypulupa1.bibliografiaAutor;

/**
 *
 * @author anthony
 */

public class Autores {

    private final String nombre;
    private final String nacionalidad;

    public Autores(String nombre, String nacionalidad) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del autor no puede estar vacío.");
        }
        this.nombre = nombre;
        this.nacionalidad = (nacionalidad == null || nacionalidad.isBlank())
                ? "Desconocida" : nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    @Override
    public String toString() {
        return nombre + " (" + nacionalidad + ")";
    }
}
