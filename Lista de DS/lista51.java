import java.util.Scanner;

public class lista51 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println(d);
        sc.close();
    }

}
