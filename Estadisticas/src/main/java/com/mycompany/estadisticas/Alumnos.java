package com.mycompany.estadisticas;

public class Alumnos {
    private String nombre;
    private int calificiacion;

    public Alumnos(String nombre, int calificiacion) {
        this.nombre = nombre;
        this.calificiacion = calificiacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCalificiacion() {
        return calificiacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCalificiacion(int calificiacion) {
        this.calificiacion = calificiacion;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", calificiacion=" + calificiacion + '}';
    }
}