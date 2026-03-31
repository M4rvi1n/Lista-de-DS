import java.util.Scanner;

public class lista13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double milhas = km / 1.61;
        System.out.println(milhas);
        sc.close();
    }

}
