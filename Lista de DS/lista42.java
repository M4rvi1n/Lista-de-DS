import java.util.Scanner;

public class lista42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double gratificacao = base * 0.05;
        double imposto = base * 0.07;
        double finalSalario = base + gratificacao - imposto;
        System.out.println(finalSalario);
        sc.close();
    }

}
