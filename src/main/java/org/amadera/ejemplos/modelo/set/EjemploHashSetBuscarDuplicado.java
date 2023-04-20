package org.amadera.ejemplos.modelo.set;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado {
    public static void main(String[] args) {

        String[] peces = {"Corvina","Lenguado","Pejerrey","Robalo","Atun", "Lenguado"};

        Set<String> unicos = new HashSet<>();
        for (String pez: peces){
            if (!unicos.add(pez)){
                System.out.println("Elemento Duplicado= " + pez);
            }
        }

        System.out.println(unicos.size()+ "Elementos no duplicados: "+unicos);
    }
}
