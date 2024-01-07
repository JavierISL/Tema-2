import java.text.BreakIterator;

public class Ejercicio_2_Intento1 {

    public static void main(String[] args) {

        int variable1 = 1;
        int variable2 = 2;
        int variable3 = 3;
        int variable4 = 4;
        int variable5 = 5;

        // Muestro las variables separadas por un espacio
        System.out.println(variable1 +" " + variable2 +" " + variable3 + " " + variable4 + " " + variable5);

        // Hago otro ejemplo con más peticiones y cambios de sitio de las variables
        System.out.println(variable5 +" " + variable3 +" " + variable1 + " " + variable2 + " " + variable3 + " " + variable1 +" " + variable2 +" " + variable3 + " " + variable4 + " " + variable5);

        //Roto los valores a la izquierda
        //int aux = variable1;
        //        variable1=variable2;
        //        variable2=variable3;
        //        variable3=variable4;
        //        variable4=variable5;
        //        variable5=aux;

        // Roto dos valores a la izquierda
        int aux = variable1;
        variable1=variable3;
        variable3=variable5;
        variable5=variable2;
        variable2=variable4;
        variable4=aux;
        System.out.println(variable1 +" " + variable2 +" " + variable3 + " " + variable4 + " " + variable5);

        //Roto los valores a la derecha
        //int aux = variable5;
        //        variable5=variable4;
        //        variable4=variable3;
        //        variable3=variable2;
        //        variable2=variable1;
        //        variable1=aux;

        //Roto dos valores a la derecha
        aux = variable5;
        variable5=variable3;
        variable3=variable1;
        variable1=variable4;
        variable4=variable2;
        variable2=aux;

        System.out.println(variable1 +" " + variable2 +" " + variable3 + " " + variable4 + " " + variable5);

        aux = variable3;
        variable3=variable1;
        variable1=variable2;
        variable2=variable5;
        variable5=variable4;
        variable4=aux;

        System.out.println(variable1 +" " + variable2 +" " + variable3 + " " + variable4 + " " + variable5);



    }
}
