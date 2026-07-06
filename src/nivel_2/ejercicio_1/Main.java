package nivel_2.ejercicio_1;


import java.util.HashSet;

public class Main {
    void main() {
        Restaurant restaurantA = new Restaurant("Can Grao", 10);
        Restaurant restaurantB = new Restaurant("Mcdonalds", 0);
        Restaurant restaurantC = new Restaurant("Mcdonalds", 0);

        HashSet<Restaurant> restaurantsHashSet = new HashSet<>();
        restaurantsHashSet.add(restaurantA);
        restaurantsHashSet.add(restaurantB);
        restaurantsHashSet.add(restaurantC);

        System.out.println("HashSet elimina McDonalds porque está repetido");
        for(Restaurant r : restaurantsHashSet){
            System.out.println(r.toString() +" \n");
        }
    }
}
