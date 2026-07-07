package nivel_3;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MenuOperaciones {

    public static Persona crearPersona (){
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el nombre: ");
        String nombre = input.nextLine();
        System.out.println("Introduce apellidos:");
        String apellido = input.nextLine();
        System.out.println("Introduce el NIF");
        String nif = input.nextLine();
        return new Persona(nombre, apellido, nif);
    }

    public static void mostrarNombresAz(String ruta) {
        List<Persona> personas = GestorCsv.leerArchivo(ruta);
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

    public static void mostrarNombresZa(String ruta){
        List<Persona> personas = GestorCsv.leerArchivo(ruta);
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

    public static void mostrarApellidosAz(String ruta) {
        List<Persona> personas = GestorCsv.leerArchivo(ruta);
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

    public static void mostrarApellidosZa(String ruta) {
        List<Persona> personas = GestorCsv.leerArchivo(ruta);
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

    public static void mostrarNif_0_9 (String ruta){
        List<Persona> personas = GestorCsv.leerArchivo(ruta);
        personas.sort(new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                int nif1 = Integer.parseInt(o1.getNif(), 0, o1.getNif().length()-1, 10);
                int nif2 = Integer.parseInt(o2.getNif(), 0, o2.getNif().length()-1, 10);

                return Integer.compare(nif1, nif2);
            }
        });
        for (Persona p : personas){
            System.out.println(p.toString());
        }

    }

    public static void mostrarNif_9_0 (String ruta){
        List<Persona> personas = GestorCsv.leerArchivo(ruta);
        personas.sort(new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                int nif1 = Integer.parseInt(o1.getNif(), 0, o1.getNif().length()-1, 10);
                int nif2 = Integer.parseInt(o2.getNif(), 0, o2.getNif().length()-1, 10);

                return Integer.compare(nif2, nif1);
            }
        });
        for (Persona p : personas){
            System.out.println(p.toString());
        }
    }
}

