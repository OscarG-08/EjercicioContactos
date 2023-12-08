/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

/**
 *
 * @author Oscar
 */
public class TestContactos1 {
    public static void main(String[] args) {
        AdminContactos admContactos = new AdminContactos();
        Contacto contacto1 = new Contacto("Oscar", "Gonzalez", new Telefono("movistar", "098126312", 10), 2.6);
        Contacto contacto2 = new Contacto("Pedro", "Alvarez", new Telefono("claro", "09712313", 20), 3.3);
        if (admContactos.buscarMasPesado(contacto1, contacto2) == null) {
            System.out.println("Ambos telefonos pesan lo mismo");
        }else{
            Contacto contacto3 = admContactos.buscarMasPesado(contacto1, contacto2);
            System.out.println("Nombre "+contacto3.getNombre()+
                "\nApellido "+contacto3.getApellido()+"\nOperadora "
                +contacto3.getTelefono().getOperadora()+"\nNumero "
                +contacto3.getTelefono().getNumero());
        }
        
        if (admContactos.comparaOperadoras(contacto1, contacto2)) {
            System.out.println("Son iguales Operadoras");
        }else{
            System.out.println("Son distintas operadoras");
        } 
    } 
}
