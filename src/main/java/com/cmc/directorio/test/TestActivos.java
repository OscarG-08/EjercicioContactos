/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

/**
 *
 * @author Oscar
 */
public class TestActivos {
    public static void main(String[] args) {
        AdminContactos admContactos = new AdminContactos();
        Contacto contacto1 = new Contacto("Oscar", "Gonzalez", new Telefono("movistar", "098126312", 10), 3.3);
        System.out.println("Nombre "+contacto1.getNombre()+
                "\nApellido "+contacto1.getApellido()+"\nOperadora "
                +contacto1.getTelefono().getOperadora()+"\nNumero "
                +contacto1.getTelefono().getNumero()+"\nWhatsapp "
                +contacto1.getTelefono().isTieneWhatsapp()+"\nActivo "
                +contacto1.isActivo());
        admContactos.activarUsuario(contacto1);
        System.out.println("\n\nNombre "+contacto1.getNombre()+
                "\nApellido "+contacto1.getApellido()+"\nOperadora "
                +contacto1.getTelefono().getOperadora()+"\nNumero "
                +contacto1.getTelefono().getNumero()+"\nWhatsapp "
                +contacto1.getTelefono().isTieneWhatsapp()+"\nActivo "
                +contacto1.isActivo());
    }
}
