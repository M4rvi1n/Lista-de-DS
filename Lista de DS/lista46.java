import java.util.Scanner;

public class lista46 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int centena = numero / 100;
        int resto = numero % 100;
        int dezena = resto / 10;
        int unidade = resto % 10;
        System.out.println("" + unidade + dezena + centena);
        sc.close();
    }

}
