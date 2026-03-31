import java.util.Scanner;

public class lista52 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a1 = sc.nextDouble();
        double a2 = sc.nextDouble();
        double a3 = sc.nextDouble();
        double premio = sc.nextDouble();
        
        double totalAposta = a1 + a2 + a3;
        
        System.out.println((a1 / totalAposta) * premio);
        System.out.println((a2 / totalAposta) * premio);
        System.out.println((a3 / totalAposta) * premio);
        sc.close();
    }

}
