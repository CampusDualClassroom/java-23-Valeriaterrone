package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Exercise23 {

    public static Map<String, Person> createHashMap() {
     Map<String, Person>  map = new HashMap<>();

     map.put("person", new Person("John", "Smith"));
     map.put("teacher", new Teacher("María", "Montessori", "Educación"));
     map.put("police", new PoliceOfficer("Jake", "Peralta", "B-99"));
     map.put("doctor", new Doctor("Gregory", "House", "Nefrología e infectología"));
     return map;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {
        map.put(key, value);  // Inserta o sobrescribe el valor
        return map.get(key);  // Devuelve el objeto insertado
    }

    public static void printMapValues(Map<String, Person> map) {
// recorro el mapa para imprimir los detalles de cada uno de sus valores
        for (Map.Entry<String, Person> entry : map.entrySet()) {
            System.out.println("Clave: " + entry.getKey());
            entry.getValue().getDetails(); // se llama al metodo get
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Map<String, Person> map = createHashMap(); // creamos el mapa con sus entradas iniciales
        addMapValue(map, "police", new PoliceOfficer("Charles", "Boyle", "B-99"));
        printMapValues(map); // imprimimos los detalles de cada valor que hay en el mapa
    }
}
