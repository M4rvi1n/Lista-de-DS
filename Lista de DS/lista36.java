import java.util.Scanner;

public class lista36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura = sc.nextDouble();
        double raio = sc.nextDouble();
        double v = Math.PI * Math.pow(raio, 2) * altura;
        System.out.println(v);
        sc.close();
    }

}
