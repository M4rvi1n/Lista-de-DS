import java.util.Scanner;

public class lista41 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorHora = sc.nextDouble();
        double horas = sc.nextDouble();
        double total = (valorHora * horas) * 1.10;
        System.out.println(total);
        sc.close();
    }

}
