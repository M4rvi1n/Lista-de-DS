import java.util.Scanner;

public class lista10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kmh = sc.nextDouble();
        double ms = kmh / 3.6;
        System.out.println(ms);
        sc.close();
    }
}


