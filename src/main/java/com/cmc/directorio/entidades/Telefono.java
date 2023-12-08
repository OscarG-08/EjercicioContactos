/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cmc.directorio.entidades;

/**
 *
 * @author Oscar
 */
public class Telefono {
    private String operadora;
    private String numero;
    private int codigo;
    private boolean tieneWhatsapp = false;

    public Telefono(String operadora, String numero, int codigo) {
        this.operadora = operadora;
        this.numero = numero;
        this.codigo = codigo;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isTieneWhatsapp() {
        return tieneWhatsapp;
    }

    public void setTieneWhatsapp(boolean tieneWhatsapp) {
        this.tieneWhatsapp = tieneWhatsapp;
    }
    
    
}
