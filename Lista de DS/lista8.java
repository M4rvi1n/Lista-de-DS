import java.util.Scanner;

public class lista8 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a temperatura em Kelvin: ");
    double kelvin = scanner.nextDouble();

    double celsius = kelvin - 273.15;

    System.out.println("Temperatura em Celsius: " + celsius);

    scanner.close();
    }
}
