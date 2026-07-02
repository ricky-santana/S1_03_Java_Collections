package nivel_1.ejercicio_1;

import java.util.ArrayList;

public class Main {
    void main (){
        ArrayList<Month> monthList = new ArrayList<Month>();
        Month enero = new Month("Enero");
        Month febrero = new Month("Febrero");
        Month marzo = new Month("Marzo");
        Month abril = new Month("Abril");
        Month mayo = new Month("Mayo");
        Month junio = new Month("Junio");
        Month julio = new Month("Julio");
        Month septiembre = new Month("Septiembre");
        Month octubre = new Month("Octubre");
        Month noviembre = new Month("Noviembre");
        Month diciembre = new Month("Diciembre");

        monthList.add(enero);
        monthList.add(febrero);
        monthList.add(marzo);
        monthList.add(abril);
        monthList.add(mayo);
        monthList.add(junio);
        monthList.add(julio);
        monthList.add(septiembre);
        monthList.add(octubre);
        monthList.add(noviembre);
        monthList.add(diciembre);

        monthList.add(7, new Month("agosto"));
        for (Month month : monthList) {
            System.out.println(month.toString() + "\n");
        }


    }

}
