/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.adso46.contactos;

import com.adso46.contactos.vistas.Principal;

/**
 *
 * @author SENA
 */
public class Contactos {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        try {
            Principal vistaPrincipal = new Principal();
            vistaPrincipal.setLocationRelativeTo(null);
            vistaPrincipal.setVisible(true);
        }
        catch (Exception e) {}
    }
}
