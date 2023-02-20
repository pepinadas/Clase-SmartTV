/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unam.smarttv;

/**
 *
 * @author angel
 */
public class NProducto {
    private int numeroSerie;
    private int añoCreacion;

    public NProducto(int numeroSerie, int añoCreacion) {
        this.numeroSerie = numeroSerie;
        this.añoCreacion = añoCreacion;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getAñoCreacion() {
        return añoCreacion;
    }

    public void setAñoCreacion(int añoCreacion) {
        this.añoCreacion = añoCreacion;
    }

    @Override
    public String toString() {
        return "NProducto{" + "numeroSerie=" + numeroSerie + ", a\u00f1oCreacion=" + añoCreacion + '}';
    }
    
    
}
