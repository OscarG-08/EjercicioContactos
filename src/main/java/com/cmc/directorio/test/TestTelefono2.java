/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

/**
 *
 * @author Oscar
 */
public class TestTelefono2 {
    public static void main(String[] args) {
        Telefono telefono = new Telefono("movistar", "09716151", 20);
        AdminTelefono admTelefono = new AdminTelefono();
        admTelefono.activarmensajeria(telefono);
        System.out.println("Operadora "+telefono.getOperadora()+"\nNumero "+telefono.getNumero()+"\nCodigo "+telefono.getCodigo()+"\nWhatsapp "+telefono.isTieneWhatsapp());
    }
}
