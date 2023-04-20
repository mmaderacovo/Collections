package org.amadera.ejemplos.modelo.List;

import org.amadera.ejemplos.modelo.Modelo.Alumno;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class EjemploListComparableComparator {
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
        //Collections.sort(sa, (a,b)->a.getNota().compareTo(b.getNota()));
        //sa.sort((a,b)->a.getNota().compareTo(b.getNota()));
        //sa.sort(Comparator.comparing((Alumno a) ->a.getNombre()).reversed());
        sa.sort(comparing(Alumno::getNota));
        System.out.println(sa);

        //Iterando usando Stream ForEach

        System.out.println();
        sa.forEach(System.out::println);
    }
}
