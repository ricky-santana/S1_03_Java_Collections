package nivel_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    void main() {
        //Banco de pruebas
       List<Persona> listaPersonas = new ArrayList<Persona>(GestorCsv.leerArchivo("Personas.csv"));
       MenuUsuario.iniciar(listaPersonas, "Personas.csv");

    }
}
