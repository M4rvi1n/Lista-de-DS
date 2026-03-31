import java.util.Scanner;

public class lista1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite um número inteiro: " );
        int numero = scanner.nextInt();

        System.out.println("O número digitado é: " + numero);

        scanner.close();
    }
    
}