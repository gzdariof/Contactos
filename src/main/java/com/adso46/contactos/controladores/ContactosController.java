/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adso46.contactos.controladores;

import com.adso46.contactos.modelos.Contacto;
import java.util.ArrayList;

/**
 *
 * @author SENA
 */
public class ContactosController {
    private static ArrayList<Contacto> ListaContactos = new ArrayList();
      
    public static void AgregarContacto (Contacto nuevo) {
        ListaContactos.add(nuevo);
    }
    
    public static String MostrarContactos () {
        String resultado = "";
        for (int i=0; i<ListaContactos.size(); i++) {
            resultado += ListaContactos.get(i).toString() + "\n";
        }
        return resultado;
    }
}
