package org.amadera.ejemplos.modelo.Maps;

import java.util.*;

public class EjemploHashMap {
    public static void main(String[] args) {

        Map<String,Object> persona=new HashMap<>();
        System.out.println("Contiene elementos= " + !persona.isEmpty());
        persona.put("nombre","Juan");
        persona.put("apellido","Gomez");
        persona.put("email","juan@gomez");
        persona.put("edad","31");

        Map<String,String> direccion = new HashMap<>();
        direccion.put("pais","USA");
        direccion.put("estado","California");
        direccion.put("ciudad","Santa Barbara");
        direccion.put("numero","120");

        persona.put("direccion",direccion);

        System.out.println("persona = " + persona);
        System.out.println();

        String nombre = (String) persona.get("nombre");
        String apellido = (String) persona.get("apellido");
        System.out.println( "Nombre= "+nombre+" Apellido= " + apellido);
        System.out.println();

        Map<String,String>direcionPersona = (Map<String, String>) persona.get("direccion");
        String pais = direcionPersona.get("pais");
        String ciudad= direcionPersona.get("ciudad");
        String barrio = direcionPersona.getOrDefault("barrio","la playa");

        System.out.println(" El pais de " + nombre +" es: "+ pais);
        System.out.println(" La ciudad de " + nombre +" es: "+ ciudad);
        System.out.println(" El barrio de " + nombre +" es: "+ barrio);
        System.out.println();

        //String valorApellido= persona.remove("apellido");
        boolean b = persona.remove("apellido","Gomez");
        System.out.println("valor eliminado= " + b);
        System.out.println(persona);

        boolean b2 = persona.containsKey("apellido");
        System.out.println("Contiene apellido= " + b2);

        boolean c = persona.containsValue("Juan");
        System.out.println("Contiene nombre= "+ c);

        System.out.println("================ values");
        Collection<Object> valores = persona.values();
        for (Object v: valores) {
            System.out.println(v);
        }
        System.out.println("============== keySet");
        Set<String> llaves = persona.keySet();
        for (String k: llaves){
            System.out.println(k);
        }
        System.out.println(" =============== entrySet");
        for (Map.Entry<String,Object>par: persona.entrySet()){
            Object valor = par.getValue();
            if (valor instanceof Map){
                String nom = (String) persona.get("nombre");
                Map<String,String> direccionMap= (Map<String, String>)valor;
               for(Map.Entry<String,String> parDir:direccionMap.entrySet()){
                   System.out.println(parDir.getKey()+" => " + parDir.getValue());
               }
            }else {
            System.out.println(par.getKey() +"=>"+ valor);
            }
        }
        System.out.println(" =============== keySet");
        for (String llave: persona.keySet()){
            Object valor = persona.get(llave);
            if (valor instanceof Map){
                String nom = (String) persona.get("nombre");
                Map<String,String> direccionMap= (Map<String, String>)valor;
                System.out.println("El pais de "+ nom + " es: " + direccionMap.get("pais"));
                System.out.println("La ciudad de "+nom+ " es: "+ direccionMap.get("ciudad"));
                System.out.println("El estado de "+nom+ " es: "+ direccionMap.get("estado"));
            }else {
            System.out.println(llave + "=>" + valor);
            }
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
