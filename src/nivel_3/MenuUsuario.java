package nivel_3;

public class MenuUsuario {
    private static final String INTRO = "Qué desea hacer:\n";
    private static final String OP1 = "1. Introducir persona";
    private static final String OP2 = "2. Mostrar personas ordenadas por el nombre A-Z\n";
    private static final String OP3 = "3. Mostrar personas ordenadas por el nombre Z-A\n";
    private static final String OP4 = "2. Mostrar personas ordenadas por el apellido A-Z\n";
    private static final String OP5 = "2. Mostrar personas ordenadas por el apellido Z-A\n";
    private static final String OP6 = "2. Mostrar personas ordenadas por el NIF 1-9\n";
    private static final String OP7 = "2. Mostrar personas ordenadas por el NIF 9-1\n";
    private static final String OP8 = "8. Salir\n";
    private String respuesta;

    public MenuUsuario(){

    }

    public static void iniciar (){
        System.out.println(INTRO + OP1 + OP2 + OP3 + OP4 + OP5 + OP6 + OP7 + OP8);
    }
}
