package org.amadera.ejemplos.modelo.Maps;

import java.util.*;

public class EjemploTreeMap {
    public static void main(String[] args) {

        Map<String,Object> persona=new TreeMap<>(Comparator.reverseOrder());
        persona.put("nombre","Juan");
        persona.put("apellido","Gomez");
        persona.put("email","juan@gomez");
        persona.put("edad","31");

        Map<String,String> direccion = new TreeMap<>();
        direccion.put("pais","USA");
        direccion.put("estado","California");
        direccion.put("ciudad","Santa Barbara");
        direccion.put("numero","120");

        persona.put("direccion",direccion);
        System.out.println("persona = " + persona);


    }
}
