package org.amadera.ejemplos.modelo.Maps;

import java.util.*;

public class EjemploHashMap {
    public static void main(String[] args) {

        Map<String,String> persona=new HashMap<>();
        System.out.println("Contiene elementos= " + !persona.isEmpty());
        persona.put("nombre","Juan");
        persona.put("apellido","Gomez");
        persona.put("email","juan@gomez");
        persona.put("edad","31");

        System.out.println("persona = " + persona);

        String nombre = persona.get("nombre");
        String apellido = persona.get("apellido");
        System.out.println( "Nombre= "+nombre+" Apellido= " + apellido);

        //String valorApellido= persona.remove("apellido");
        boolean b = persona.remove("apellido","Gomez");
        System.out.println("valor eliminado= " + b);
        System.out.println(persona);

        boolean b2 = persona.containsKey("apellido");
        System.out.println("Contiene apellido= " + b2);

        boolean c = persona.containsValue("Juan");
        System.out.println("Contiene nombre= "+ c);

        System.out.println("================ values");
        Collection<String> valores = persona.values();
        for (String v: valores) {
            System.out.println(v);
        }
        System.out.println("============== keySet");
        Set<String> llaves = persona.keySet();
        for (String k: llaves){
            System.out.println(k);
        }
        System.out.println(" =============== entrySet");
        for (Map.Entry<String,String>par: persona.entrySet()){
            System.out.println(par.getKey() +"=>"+ par.getValue());
        }
        System.out.println(" =============== keySet");
        for (String llave: persona.keySet()){
            String valor = persona.get(llave);
            System.out.println(llave + "=>" + valor);
        }
        System.out.println(" =============== java 8");
        persona.forEach((llave,valor)->{
            System.out.println(llave +"=> " + valor);
        });

        System.out.println();
        System.out.println("Total= "+ persona.size());
        System.out.println("Contiene elementos= " + !persona.isEmpty());
        
        persona.replace("nombre","Pablo");
        System.out.println("persona = " + persona);



    }
}
