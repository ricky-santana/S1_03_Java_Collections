package nivel_2.ejercicio_2;

import nivel_2.ejercicio_1.Restaurant;

public class Main {
    void main() {
//COMPARABLE O COMPARATOR
        Restaurant restaurant1 = new Restaurant("Kyto Vibes", 7);
        Restaurant restaurant2 = new Restaurant("Can Tomás", 9);
        Restaurant restaurant3 = new Restaurant("Can Tomás", 10);

        restaurant1.compare();
    }
}
