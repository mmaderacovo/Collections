package org.amadera.ejemplos.set;

import org.amadera.ejemplos.modelo.Alumno;

import static java.util.Comparator.comparing;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {

        //Set<Alumno> sa = new TreeSet<>((a,b)-> a.getNombre().compareTo(b.getNombre()));
        Set<Alumno> sa = new TreeSet<>(comparing(Alumno::getNota).reversed());
        sa.add(new Alumno("Diana", 5));
        sa.add(new Alumno("Rey", 6));
        sa.add(new Alumno("Danna", 7));
        sa.add(new Alumno("Ana", 3));
        sa.add(new Alumno("Camilo", 10));
        sa.add(new Alumno("Paula", 2));
        sa.add(new Alumno("Pamela", 2));

        System.out.println(sa);
    }
}
