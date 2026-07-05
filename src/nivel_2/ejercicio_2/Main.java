package nivel_2.ejercicio_2;

import nivel_2.ejercicio_1.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Main {
    void main() {
        List<Restaurant> restaurants = new ArrayList<Restaurant>();
        Restaurant restaurant1 = new Restaurant("Kyto Vibes", 7);
        Restaurant restaurant2 = new Restaurant("Can Tomás", 9);
        Restaurant restaurant3 = new Restaurant("Can Tomás", 10);

        restaurants.add(restaurant1);
        restaurants.add(restaurant2);
        restaurants.add(restaurant3);

       for (Restaurant r : restaurants){
           System.out.println(r.toString());
       }
    }
}
