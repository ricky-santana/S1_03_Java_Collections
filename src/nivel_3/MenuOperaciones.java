package nivel_3;

import java.util.Comparator;
import java.util.List;

public class MenuOperaciones {
    public MenuOperaciones() {
    }

    public static void mostrarNombresAz(List<Persona> personas) {
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

    public static void mostrarNombresZa(List<Persona> personas){
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

    public static void mostrarApellidosAz(List<Persona> personas) {
        personas.sort(new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getSurname().compareTo(o2.getSurname());
            }
        });
        for (Persona p : personas) {
            System.out.println(p.toString());
        }

    }

    public static void mostrarApellidosZa(List<Persona> personas) {
        personas.sort(new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o2.getSurname().compareTo(o1.getSurname());
            }
        });
        for (Persona p : personas) {
            System.out.println(p.toString());
        }

    }
}

