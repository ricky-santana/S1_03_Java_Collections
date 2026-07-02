package nivel_1.ejercicio_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TextToArray {
    private String doc;
    private ArrayList<String> countryList;
    private ArrayList<String> capitalList;

    public TextToArray(String doc) throws IOException {
        this.doc = doc;
        this.countryList = new ArrayList<String>();
        this.capitalList = new ArrayList<String>();
        this.readAndWrite();
    }

    public void readAndWrite() throws IOException {
        BufferedReader br = new BufferedReader (new FileReader(doc));
        String line;
           while((line =br.readLine())!=null){

            int posicionEspacio = line.indexOf(" ");

            if (posicionEspacio != -1) {

                String pais = line.substring(0, posicionEspacio);
                countryList.add(pais);

                String capital = line.substring(posicionEspacio + 1);
                capitalList.add(capital);
            }
        }
    }
    public ArrayList<String> getCountries (){
        return this.countryList;
    }

    public ArrayList<String> getCapitals (){
        return this.capitalList;
    }
}

