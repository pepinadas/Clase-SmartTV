/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unam.smarttv;

/**
 *
 * @author angel
 */
public class SmarTv {
    
    private String marca;
    private String modelo;
    private Especificaciones especificaciones;

    public SmarTv(String marca, String modelo, Especificaciones especificaciones) {
        this.marca = marca;
        this.modelo = modelo;
        this.especificaciones = especificaciones;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Especificaciones getEspecificaciones() {
        return especificaciones;
    }

    public void setEspecificaciones(Especificaciones especificaciones) {
        this.especificaciones = especificaciones;
    }

    @Override
    public String toString() {
        return "SmarTv{" + "marca=" + marca + ", modelo=" + modelo + ", especificaciones=" + especificaciones + '}';
    }

    
    
    
    
    
}
