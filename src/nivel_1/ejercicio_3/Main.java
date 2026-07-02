package nivel_1.ejercicio_3;

import java.util.HashMap;

public class Main {
    void main() {
        HashMap<String, String> capHash = ArrayToHash.genHash("countries.txt");
        System.out.println(capHash.toString());



    }
}
