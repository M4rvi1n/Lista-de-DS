import java.util.Scanner;

public class lista7 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a temperatura em graus Fahrenheit: ");
    double fahrenheit = scanner.nextDouble();

    double celsius = 5.0 * (fahrenheit - 32.0) / 9.0;

    System.out.println("Temperatura em Celsius: " + celsius);

    scanner.close();
    }
}
