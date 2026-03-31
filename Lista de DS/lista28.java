import java.util.Scanner;

public class lista28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double r = a*a + b*b + c*c;
        System.out.println(r);
        sc.close();
    }

}
