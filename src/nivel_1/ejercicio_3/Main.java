package nivel_1.ejercicio_3;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.HashMap;

public class Main {
    void main() {
        HashMap<String, String> capHash = HashCreator.genHash("countries.txt");
        System.out.println(capHash.toString());



    }
}
