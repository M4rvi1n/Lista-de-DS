import java.util.Scanner;

public class lista5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        double numero = scanner.nextDouble();

        double quintaParte = numero / 5;

        System.out.println("A quinta parte do número é: " + quintaParte);

        scanner.close();
    }
}
