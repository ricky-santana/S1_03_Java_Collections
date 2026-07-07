package nivel_3;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MenuUsuario {
    private static final String INTRO = "Qué desea hacer:\n";
    private static final String OP1 = "1. Introducir persona\n";
    private static final String OP2 = "2. Mostrar personas ordenadas por el nombre A-Z\n";
    private static final String OP3 = "3. Mostrar personas ordenadas por el nombre Z-A\n";
    private static final String OP4 = "4. Mostrar personas ordenadas por el apellido A-Z\n";
    private static final String OP5 = "5. Mostrar personas ordenadas por el apellido Z-A\n";
    private static final String OP6 = "6. Mostrar personas ordenadas por el NIF 1-9\n";
    private static final String OP7 = "7. Mostrar personas ordenadas por el NIF 9-1\n";
    private static final String OP8 = "8. Salir\n";
    private static final String EXCEPTION = "Introduce un número del 1 al 8";
    private static final String OUTMESSAGE = "Adiós";
    private String respuesta;

    public static void iniciar (String ruta){
        Scanner input = new Scanner(System.in);
        byte menu = 0;

        while (menu != 8) {
            System.out.println(INTRO + OP1 + OP2 + OP3 + OP4 + OP5 + OP6 + OP7 + OP8);
            try {
                menu = input.nextByte();
            } catch (InputMismatchException e) {
                input.nextLine();
                menu = 0;
            }
            switch (menu) {
                case 1:
                    GestorCsv.insertarPersona(ruta);
                    break;
                case 2:
                    MenuOperaciones.mostrarNombresAz(ruta);
                    break;
                case 3:
                    MenuOperaciones.mostrarNombresZa(ruta);
                    break;
                case 4:
                    MenuOperaciones.mostrarApellidosAz(ruta);
                    break;
                case 5:
                    MenuOperaciones.mostrarApellidosZa(ruta);
                    break;
                case 6:
                    MenuOperaciones.mostrarNif_0_9(ruta);
                    break;
                case 7:
                    MenuOperaciones.mostrarNif_9_0(ruta);
                    break;
                case 8:
                    System.out.println(OUTMESSAGE);
                    break;
                default:
                    System.out.println(EXCEPTION);
            }

        }
    }

}
