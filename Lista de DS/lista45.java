import java.util.Scanner;

public class lista45 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra = sc.next().charAt(0);
        char minuscula = (char) (letra + 32);
        System.out.println(minuscula);
        sc.close();
    }

}
