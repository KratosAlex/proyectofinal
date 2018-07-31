/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.*;

/**
 *
 * @author kratos
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        
        try {
        ArrayList<Opcion> opciones=modelo.PersistenciaPregunta.leer().get(0).getOpciones();
        for(Opcion o : opciones){
            System.out.println(o.getTitulo());
        }
        
            ArrayList<Opcion> opciones2=PersistenciaPregunta.leer().get(0).getOpciones();
            opciones2=modelo.PersistenciaPregunta.opcionesAleatorias(opciones2);
        for(Opcion o : opciones2){
            System.out.println(o.getTitulo());
        }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
