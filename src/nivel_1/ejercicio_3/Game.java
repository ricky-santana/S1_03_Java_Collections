package nivel_1.ejercicio_3;

import javax.xml.transform.Source;
import java.util.HashMap;
import java.util.Scanner;

public class Game {
    public Game() {
    }

    public static void play (HashMap<String, String> countryCapitals){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String userName = scanner.nextLine();

        byte points = 0;
        System.out.println("Juguemos " + userName + " tienes 10 rondas para lograr la máxima puntuación" );

        byte rondas = 0;
        while (rondas < 11){
            byte random = (byte) (Math.random() * 51);
            String randomCountry = new TextToArray().getCountries().get(random);

            System.out.println("Ronda nº" + (rondas +1) );
            System.out.println("Cual es la capital de: " + randomCountry);
            String answer = scanner.nextLine();

            String respuesta;
            if (countryCapitals.get(randomCountry).equals(answer)){
                points++;
                respuesta = ("Bingo, has ganado 1 punto");
            } else {
                respuesta = ("Error, Has fallado");
            }
            rondas++;
            System.out.println(respuesta +
                    "\nTotal de puntos: " + points +
                    "\nRondas restantes: " + (11 - rondas) );


        }
        System.out.println("Se acabó " + userName + " ya has jugado suficiente, a programar!!!");

    }
}
