package nivel_3;

import java.util.Comparator;

public class Persona implements Comparator <Persona>{
    private final String name;
    private final String surname;
    private final String nif;


    public Persona(String name, String apellido, String nif) {
        this.name = name;
        this.surname = apellido;
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "name = " + name +
                " surname = " + surname +
                " NIF = " + nif;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNif() {
        return nif;
    }


    @Override
    public int compare(Persona o1, Persona o2) {
        return 0;
    }

    @Override
    public Comparator reversed() {
        return Comparator.super.reversed();
    }
}
