package org.amadera.ejemplos.modelo.List;

import org.amadera.ejemplos.modelo.Modelo.Alumno;

import java.util.ArrayList;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {

        List<Alumno> al = new ArrayList<>();
        System.out.println(al+ " , size "+ al.size());
        System.out.println("Esta vacia la lista "+ al.isEmpty());
        al.add(new Alumno("Diana", 5));
        al.add(new Alumno("Rey", 6));
        al.add(new Alumno("Danna", 7));
        al.add(2, new Alumno("Ana", 3));
        al.add (new Alumno("Camilo", 10));
        al.set(3, new Alumno("Paula", 2));

        System.out.println(al+ " , size "+ al.size());

        //al.remove(new Alumno("Camilo",10 ));
        al.remove(2);
        System.out.println(al+ ", size "+al.size());

        boolean b = al.contains(new Alumno("Ana",3));
        System.out.println(b);

        Object a[] = al.toArray();
        for (int i = 0; i < a.length; i++) {
            System.out.println("Desde el arreglo"+ a[i]);
        }

    }
}
