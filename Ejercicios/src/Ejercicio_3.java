import java.util.Scanner;
import java.util.SequencedCollection;

public class Ejercicio_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el valor del primer número");
        int operando1 = scanner.nextInt();
        System.out.println("Introduce el valor del segundo número");
        int operando2 = scanner.nextInt();

        System.out.println("El resustado de la suma es: "+(operando1+operando2));
        System.out.println("El resultado de la resta es: "+(operando1-operando2));
        System.out.println("El resutado de la multiplicación es: "+(operando1*operando2));
        System.out.println("El resultado de la división es: "+(operando1/operando2));
        System.out.println("El resultado de la division real es: "+((double)operando1/operando2));
        System.out.println("El resultado del resto es: "+(operando1%operando2));




    }
}
