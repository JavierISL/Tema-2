public class Ejercicio_4_Intento1 {
    public static void main(String[] args) {

        int segundos = 24973;
        int horas = segundos/3600;
        segundos = (segundos%3600);
        int minutos = segundos/60;
        segundos = segundos%60;

        System.out.printf("La conversión es de: %d horas %d minutos y %d segundos",horas,minutos,segundos);




    }
}
