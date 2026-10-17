/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adso46.contactos.modelos;

/**
 *
 * @author SENA
 */
public class Contacto {
    
    // Definir las variables del Objeto Contacto
    private String NombreCompleto;
    private String CorreoElectronico;
    private int Genero;
    private boolean EsCasado;
    private boolean TieneCasaPropia;
    
    public Contacto () {
        this.NombreCompleto = "";
        this.CorreoElectronico = "";
        this.Genero = 0;
        this.EsCasado = false;
        this.TieneCasaPropia = false;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    public int getGenero() {
        return Genero;
    }

    public void setGenero(int Genero) {
        this.Genero = Genero;
    }

    public boolean isEsCasado() {
        return EsCasado;
    }

    public void setEsCasado(boolean EsCasado) {
        this.EsCasado = EsCasado;
    }

    public boolean isTieneCasaPropia() {
        return TieneCasaPropia;
    }

    public void setTieneCasaPropia(boolean TieneCasaPropia) {
        this.TieneCasaPropia = TieneCasaPropia;
    }

    @Override
    public String toString() {
        return "Contacto{\n" + 
                "NombreCompleto=" + NombreCompleto + 
                ",\nCorreoElectronico=" + CorreoElectronico + 
                ",\nGenero=" + Genero + 
                ",\nEsCasado=" + EsCasado + 
                ",\nTieneCasaPropia=" + TieneCasaPropia + '}';
    }
    
    
}
