package org.amadera.ejemplos.modelo.Maps;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
    public static void main(String[] args) {

        Map<String,String> persona=new HashMap<>();
        persona.put("nombre","Juan");
        persona.put("apellido","Gomez");
        persona.put("email","juan@gomez");
        persona.put("edad","31");

        System.out.println("persona = " + persona);

        String nombre = persona.get("nombre");
        String apellido = persona.get("apellido");
        System.out.println( "Nombre= "+nombre+" Apellido= " + apellido);


    }
}
