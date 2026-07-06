package nivel_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    void main() {
        //Banco de pruebas
       List<Persona> listaPersonas = new ArrayList<Persona>(GestorCsv.leerArchivo("Personas.csv"));
//
//        System.out.println("Imprimiendo lista de ejemplo");
//        for (Persona p : listaPersonas){
//            System.out.println(p.toString());
//        }
//
//        Persona personaAgregada = new Persona("Julio", "Maldonado", "22990099F");
//        GestorCsv.insertarPersona(personaAgregada, "Personas.csv");
//
//        System.out.println("Imprimiendo lista después de insertar una persona de ejemplo");
//        listaPersonas = GestorCsv.leerArchivo("Personas.csv");
//        for (Persona p : listaPersonas) {
//            System.out.println(p.toString());
//        }
//
//        MenuUsuario.iniciar();

//        MenuOperaciones.mostrarApellidosAz(listaPersonas);
//        System.out.println("--------Za:---------");
//        MenuOperaciones.mostrarApellidosZa(listaPersonas);

        MenuOperaciones.mostrarNif_0_9(listaPersonas);
        System.out.println("--------9-0:---------");
        MenuOperaciones.mostrarNif_9_0(listaPersonas);
    }
}
