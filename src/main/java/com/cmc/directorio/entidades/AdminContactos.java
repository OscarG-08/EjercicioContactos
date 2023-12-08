/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cmc.directorio.entidades;

/**
 *
 * @author Oscar
 */
public class AdminContactos {
    public Contacto buscarMasPesado(Contacto contacto1, Contacto contacto2){
        if (contacto1.getPeso() > contacto2.getPeso()) {
            return contacto1;
        }
        if (contacto1.getPeso() < contacto2.getPeso()) {
            return contacto2;
        }
        return null;
    } 
    public boolean comparaOperadoras(Contacto contacto1, Contacto contacto2){
        if (contacto1.getTelefono().getOperadora().equals(contacto2.getTelefono().getOperadora())) {
            return true;
        }else{
            return false;
        }
    }
    public void activarUsuario(Contacto contacto){
        AdminTelefono admTelefono = new AdminTelefono();
        admTelefono.activarmensajeria(contacto.getTelefono());
        if (contacto.getTelefono().isTieneWhatsapp()) {
            contacto.setActivo(true);
        }
    }
}
