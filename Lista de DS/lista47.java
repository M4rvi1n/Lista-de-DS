import java.util.Scanner;

public class lista47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        System.out.println(numero / 1000);
        System.out.println((numero % 1000) / 100);
        System.out.println((numero % 100) / 10);
        System.out.println(numero % 10);
        sc.close();
    }

}
