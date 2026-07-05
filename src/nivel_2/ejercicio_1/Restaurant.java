package nivel_2.ejercicio_1;

import java.util.Comparator;
import java.util.Objects;

public class Restaurant implements Comparable <Restaurant> {
    private String name;
    private int score;

    public Restaurant(String name, int score) {
        this.name = name;
        this.score = score;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return score == that.score && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }


    @Override
    public int compareTo(Restaurant o) {
        int result = this.name.compareTo(o.name);

        if (result == -1 || result == 1){
            result = Integer.compare(this.score, o.score);
        }

        return result;
    }
}
