package nivel_3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MenuOperaciones {
    public MenuOperaciones() {
    }

    public static void mostrarPersonasAz (List<Persona> personas) {
        personas.sort(new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Persona p : personas) {
            System.out.println(p.toString());
        }

    }
    
    public static void mostrarPersonasZa (List<Persona> personas){
        personas.sort(new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });
        for (Persona p : personas) {
            System.out.println(p.toString());
        }
    }
}

