package org.amadera.ejemplos.set;

import org.amadera.ejemplos.modelo.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {

        Set<Alumno> sa = new TreeSet<>();
        sa.add(new Alumno("Diana", 5));
        sa.add(new Alumno("Rey", 6));
        sa.add(new Alumno("Danna", 7));
        sa.add(new Alumno("Ana", 3));
        sa.add(new Alumno("Camilo", 10));
        sa.add(new Alumno("Paula", 2));

        System.out.println(sa);
    }
}
