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
public class TestTelefono3 {
    public static void main(String[] args) {
        AdminTelefono admTel = new AdminTelefono();
        Telefono telefono = new Telefono("movistar", "0981723123", 10);
        Telefono telefono2 = new Telefono("claro", "097852371", 20);
        Telefono telefono3 = new Telefono("movistar", "0951241238", 15);
        System.out.println("Movistar "+admTel.contarMovi(telefono, telefono2, telefono3));
    }
}
