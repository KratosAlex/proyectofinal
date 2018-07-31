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
public class ProbarOrdenamientos {
    
    public static void main(String[] args) {
        //un arreglo que no acepta valoresduplicados 
    Set<Integer> enteros=new LinkedHashSet<>();
   // enteros.add(2);
   // enteros.add(3);
   // enteros.add(2);
    
        //System.out.println(enteros.size());

        while(enteros.size()<4){
            Random r=new Random();
        int valor=r.nextInt(4);
        enteros.add(valor);
           }
       
    
    }
        }
    

