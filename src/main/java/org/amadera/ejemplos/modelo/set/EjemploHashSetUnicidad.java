package org.amadera.ejemplos.modelo.set;

import org.amadera.ejemplos.modelo.Modelo.Alumno;

import java.util.*;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {

        //Set<Alumno> sa = new HashSet<>();
        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Diana", 5));
        sa.add(new Alumno("Rey", 6));
        sa.add(new Alumno("Danna", 7));
        sa.add(new Alumno("Ana", 3));
        sa.add(new Alumno("Camilo", 10));
        sa.add(new Alumno("Paula", 2));
        sa.add(new Alumno("Paula", 3));

        System.out.println(sa + "\n");

        //Utilizando un for clasico
        for (int i = 0; i < sa.size(); i++) {
            Alumno a =sa.get(i);
            System.out.println(a.getNombre());
        }
        System.out.println();

        //Iterando usando for each
        for (Alumno a: sa){
            System.out.println(a.getNombre());
        }
        System.out.println();

        //Iterando usando while e Iterator
        Iterator<Alumno> it = sa.iterator();
        while (it.hasNext()){
            Alumno a = it.next();
            System.out.println(a.getNombre());

        }
        //Iterando usando Stream ForEach
        System.out.println();
        sa.forEach(System.out::println);
    }
}
