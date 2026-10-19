package com.mycompany.estadisticas;

import java.util.List;

public class Estadisticas {
    private double aprobados;
    private double reprobados;
    private int mejorCalf;
    private int peorCalf;
    private double promedio;

    public Estadisticas(List<Alumnos> lista) {
        if (lista == null || lista.isEmpty()) {
            return;
        }

        int total = lista.size();
        int numAprobados = 0;
        int suma = 0;
        mejorCalf = lista.get(0).getCalificiacion();
        peorCalf = lista.get(0).getCalificiacion();

        for (Alumnos al : lista) {
            int c = al.getCalificiacion();
            suma += c;
            if (c >= 6) {
                numAprobados++;
            }
            if (c > mejorCalf) {
                mejorCalf = c;
            }
            if (c < peorCalf) {
                peorCalf = c;
            }
        }

        aprobados = numAprobados * 100.0 / total;
        reprobados = 100.0 - aprobados;
        promedio = (double) suma / total;
    }

    public double getAprobados() { return aprobados; }
    public double getReprobados() { return reprobados; }
    public int getMejorCalf() { return mejorCalf; }
    public int getPeorCalf() { return peorCalf; }
    public double getPromedio() { return promedio; }

    @Override
    public String toString() {
        return String.format("Aprobados: %.1f%% | Reprobados: %.1f%% | Mejor: %d | Peor: %d | Promedio: %.2f",
                aprobados, reprobados, mejorCalf, peorCalf, promedio);
    }
}