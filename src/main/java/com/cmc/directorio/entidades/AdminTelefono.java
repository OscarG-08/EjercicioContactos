/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cmc.directorio.entidades;

/**
 *
 * @author Oscar
 */
public class AdminTelefono {
    public void activarmensajeria(Telefono telefono){
        if (telefono.getOperadora().equals("movistar")) {
            telefono.setTieneWhatsapp(true);
        }
    }
    public int contarMovi(Telefono telefono1, Telefono telefono2, Telefono telefono3){
        int contador = 0;
        if (telefono1.getOperadora().equals("movistar")) {
            contador++;
        }
        if(telefono2.getOperadora().equals("movistar")){
            contador++;
        }
        if(telefono3.getOperadora().equals("movistar")){
            contador++;
        }
        return contador;
    }
    public int contarClaro(Telefono telefono1, Telefono telefono2, Telefono telefono3, Telefono telefono4){
        int contador = 0;
        if (telefono1.getOperadora().equals("claro")) {
            contador++;
        }
        if(telefono2.getOperadora().equals("claro")){
            contador++;
        }
        if(telefono3.getOperadora().equals("claro")){
            contador++;
        }
        if(telefono4.getOperadora().equals("claro")){
            contador++;
        }
        return contador;
    }
}
