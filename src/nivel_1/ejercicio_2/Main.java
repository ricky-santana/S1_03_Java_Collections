package nivel_1.ejercicio_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    void main() {

        List <Integer> intList = new ArrayList<Integer>();
        List <Integer> inverseList = new ArrayList<Integer>();


        int number;
        for(int i = 0; i <5; i++){
            number = (int) (Math.random()*100);
            intList.add(number);
            System.out.println(intList.get(i) + "\n");
        }
        for (int n : intList){
            inverseList.addFirst(n);
        }

        System.out.println("Lista inversa: ");
        for (int i = 0; i < intList.size(); i++){
            System.out.println(inverseList.get(i) + "\n");
        }


    }
}
