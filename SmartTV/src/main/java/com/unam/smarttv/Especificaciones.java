/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unam.smarttv;

/**
 *
 * @author angel
 */
public class Especificaciones {
    private int pulgadas;
    private String resolucion;
    private NProducto nProducto;

    public Especificaciones(int pulgadas, String resolucion, NProducto nProducto) {
        this.pulgadas = pulgadas;
        this.resolucion = resolucion;
        this.nProducto = nProducto;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public NProducto getnProducto() {
        return nProducto;
    }

    public void setnProducto(NProducto nProducto) {
        this.nProducto = nProducto;
    }

    @Override
    public String toString() {
        return "Especificaciones{" + "pulgadas=" + pulgadas + ", resolucion=" + resolucion + ", nProducto=" + nProducto + '}';
    }

    
    
    
}
