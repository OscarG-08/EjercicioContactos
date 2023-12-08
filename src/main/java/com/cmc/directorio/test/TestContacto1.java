/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

/**
 *
 * @author Oscar
 */
public class TestContacto1 {
    public static void main(String[] args) {
        Contacto contacto = new Contacto("Oscar", "Gonzalez", new Telefono("movistar", "0987123123", 20), 12.5);
        System.out.println("Nombre "+contacto.getNombre()+
                "\nApellido "+contacto.getApellido()+"\nOperadora "
                +contacto.getTelefono().getOperadora()+"\nNumero "
                +contacto.getTelefono().getNumero());
    }
       
}
