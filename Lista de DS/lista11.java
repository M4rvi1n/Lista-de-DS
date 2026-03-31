import java.util.Scanner;

public class lista11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ms = sc.nextDouble();
        double kmh = ms * 3.6;
        System.out.println(kmh);
        sc.close();
    }
}


