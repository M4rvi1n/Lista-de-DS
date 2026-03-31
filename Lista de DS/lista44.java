import java.util.Scanner;

public class lista44 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double alturaDesejada = sc.nextDouble();
        double alturaDegrau = sc.nextDouble();
        double total = alturaDesejada / alturaDegrau;
        System.out.println(Math.ceil(total));
        sc.close();
    }

}
