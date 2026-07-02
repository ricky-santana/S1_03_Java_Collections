package nivel_1.ejercicio_3;

import java.util.HashMap;
import java.util.Scanner;

public class Game {
    public Game() {
    }

    public static void play (HashMap<String, String> countryCapitals){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String userName = scanner.nextLine();

        byte puntos = 0;
        System.out.println("Juguemos " + userName + " tienes 10 rondas para lograr la máxima puntuación" );

        byte rondas = 0;
        while (rondas < 11){
            byte random = (byte) (Math.random() * 51 + 1);
            String randomCountry = new TextToArray().getCountries().get(random);
            System.out.println("Ronda nº" + rondas +1 );
            System.out.println("País " + randomCountry); //

        }

    }
}
