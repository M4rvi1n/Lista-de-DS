import java.util.Scanner;

public class lista50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        int anoAtual = sc.nextInt();
        System.out.println(anoAtual - idade);
        sc.close();
    }

}
