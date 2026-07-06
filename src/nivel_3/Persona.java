package nivel_3;

public class Persona {
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
}
