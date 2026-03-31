import java.util.Scanner;

public class lista38 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        double novoSalario = salario * 1.25;
        System.out.println(novoSalario);
        sc.close();
    }

}
