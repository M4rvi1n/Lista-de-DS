import java.util.Scanner;

public class lista12 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double milhas = sc.nextDouble();
        double km = milhas * 1.61;
        System.out.println(km);
        sc.close();
    }

}
