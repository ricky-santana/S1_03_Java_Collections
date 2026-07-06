package nivel_3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class GestorCsv {

    public GestorCsv() {
    }

    public static List<Persona> leerArchivo (String ruta){
        List<Persona> lista = new ArrayList<>();
        String row;
        try {
            BufferedReader lector = new BufferedReader(new FileReader(ruta));
            lector.readLine(); // Me salto la primera fila
            while ((row = lector.readLine()) != null){
                int primerSeparador = row.indexOf(";");
                int segundoSeparador = row.indexOf(";", primerSeparador+1);
                String nombre = row.substring(0, primerSeparador);

                String apellido = row.substring(primerSeparador+1,segundoSeparador);

                String nif = row.substring(segundoSeparador+1);

                lista.add(new Persona(nombre, apellido, nif));
            }

            lector.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }

        return lista;
    }

    public static void insertarPersona (Persona persona, String ruta){
        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter(ruta, true));
            String line;
            line = persona.getName() + ";" + persona.getSurname() + ";" + persona.getNif();
            escritor.append(line);
            escritor.newLine();
            escritor.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
        }
    }
}
