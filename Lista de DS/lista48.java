import java.util.Scanner;

public class lista48 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSegundos = sc.nextInt();
        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;
        System.out.println(horas + ":" + minutos + ":" + segundos);
        sc.close();
    }

}
