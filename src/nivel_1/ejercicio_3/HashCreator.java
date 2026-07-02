package nivel_1.ejercicio_3;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

public class HashCreator {
    private HashMap<String, String> counCapHash;

    public HashCreator() {
        this.counCapHash = new HashMap<>();
    }

    public static HashMap<String, String> genHash (String ruta){
        CountryCapitalReader cap = null;
        HashMap<String, String> couCapHashMap = new HashMap<String, String>();
        try {
            cap = new CountryCapitalReader(ruta);
        } catch (IOException e) {
            System.out.println(e.toString());;
        }

        for (int i = 0; i < cap.getCapitals().size(); i++){
            couCapHashMap.put(cap.getCountries().get(i), cap.getCapitals().get(i));
        }

        return couCapHashMap;

    }

}
