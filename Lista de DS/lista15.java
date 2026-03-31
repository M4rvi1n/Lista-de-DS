import java.util.Scanner;

public class lista15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rad = sc.nextDouble();
        double graus = rad * 180 / 3.14;
        System.out.println(graus);
        sc.close();
    }

}
