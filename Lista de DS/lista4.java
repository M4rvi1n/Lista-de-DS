import java.util.Scanner;

public class lista4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        double numero = scanner.nextDouble();

        double quadrado = numero * numero;

        System.out.println("O quadrado do número é: " + quadrado);

        scanner.close();
    }
}
