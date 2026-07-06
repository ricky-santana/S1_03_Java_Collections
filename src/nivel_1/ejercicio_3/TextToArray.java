package nivel_1.ejercicio_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextToArray {
    private String doc;
    private static List<String> countryList;
    private static List<String> capitalList;

    public TextToArray(String doc) throws IOException {
        this.doc = doc;
        countryList = new ArrayList<String>();
        capitalList = new ArrayList<String>();
        this.readAndWrite();
    }
    public TextToArray (){
    }

    public void readAndWrite() throws IOException {
        BufferedReader br = new BufferedReader (new FileReader(doc));
        String line;
           while((line = br.readLine())!=null){

            int posicionEspacio = line.indexOf(" ");

            if (posicionEspacio != -1) {

                String pais = line.substring(0, posicionEspacio);
                countryList.add(pais);

                String capital = line.substring(posicionEspacio + 1);
                capitalList.add(capital);
            }
        }
    }
    public List<String> getCountries (){
        return this.countryList;
    }

    public List<String> getCapitals (){
        return this.capitalList;
    }
}

