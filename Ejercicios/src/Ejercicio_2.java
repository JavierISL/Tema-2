public class Ejercicio_2 {

    public static void main(String[] args) {
        int variable1 = 3;
        int variable2 = 5;
        int variable3 = 1;
        int variable4 = 9;
        int variable5 = 2;

        System.out.println(variable1 +" "+variable2 +" "+variable3 +" "+variable4 +" "+variable5);

        int aux = variable1;
        variable1=variable2;
        variable2=variable3;
        variable3=variable4;
        variable4=variable5;
        variable5= aux;

        System.out.println(variable1 +" "+variable2 +" "+variable3 +" "+variable4 +" "+variable5);

        aux = variable5;
        variable5=variable4;
        variable4=variable3;
        variable3=variable2;
        variable2=variable1;
        variable1= aux;

        System.out.println(variable1 +" "+variable2 +" "+variable3 +" "+variable4 +" "+variable5);

    }
}
