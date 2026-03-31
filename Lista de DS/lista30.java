import java.util.Scanner;

public class lista30 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double real = sc.nextDouble();
        double cot = sc.nextDouble();
        double dol = real / cot;
        System.out.println(dol);
        sc.close();
    }

}
