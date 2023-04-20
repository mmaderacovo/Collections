package org.amadera.ejemplos.set;

import org.amadera.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploLinkedList {
    public static void main(String[] args) {

        LinkedList<Alumno> lili = new LinkedList<>();
        System.out.println(lili+ " , size "+ lili.size());
        System.out.println("Esta vacia la lista "+ lili.isEmpty());
        lili.add(new Alumno("Diana", 5));
        lili.add(new Alumno("Rey", 6));
        lili.add(new Alumno("Danna", 7));
        lili.add(new Alumno("Ana", 3));
        lili.add (new Alumno("Camilo", 10));
        lili.add(new Alumno("Paula", 2));

        System.out.println(lili+ " , size "+ lili.size());

        lili.addFirst(new Alumno("Carolina",7));
        lili.addLast(new Alumno("Juan",9));
        System.out.println(lili+ " , size "+ lili.size());

        System.out.println("Primero: "+ lili.getFirst());
        System.out.println("Ultimo: " + lili.getLast());
        System.out.println("Indice = " + lili.get(3));

        Alumno carolina = lili.removeFirst();
        lili.removeLast();
        System.out.println(lili+ " , size "+ lili.size());

        Alumno a = new Alumno("Catalina",7);
        lili.addLast(a);
        System.out.println("Indice de Catalina: "+ lili.indexOf(a));

        lili.remove(3);
        System.out.println(lili+ " , size "+ lili.size());

        lili.set(3, new Alumno("Pedro", 8));
        System.out.println(lili+ " , size "+ lili.size());

        ListIterator<Alumno> li = lili.listIterator();
        while(li.hasNext()){
            Alumno alumno =li.next();
            System.out.println(alumno);
        }
        System.out.println("============ Perevious");
        while (li.hasPrevious()){
           Alumno alumno = li.previous();
            System.out.println(alumno);
        }
    }
}
