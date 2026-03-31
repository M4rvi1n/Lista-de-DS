import java.util.Scanner;

public class lista53 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double l = sc.nextDouble();
        double p = sc.nextDouble();
        double custo = 2 * (c + l) * p;
        System.out.println(custo);
        sc.close();
    }

}
