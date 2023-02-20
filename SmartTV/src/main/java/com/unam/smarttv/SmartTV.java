/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unam.smarttv;

import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class SmartTV {
    public static void main(String[] args) {
        
        SmarTv smarTV  = new SmarTv("LG", "Color View", new Especificaciones(32, "Full HD", new NProducto(233623, 2021) ));
        
        System.out.println(smarTV);
                
        ArrayList<SmarTv> Tele = new ArrayList<>();
            Tele.add(smarTV);
            Tele.add(new SmarTv("Samsung", "New Color", new Especificaciones(24, "4k", new NProducto(233623, 2021))));
           
        System.out.println(Tele);
    }
    
}
