import java.util.Scanner;

public class lista40 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dias = sc.nextInt();
        double bruto = dias * 30.00;
        double liquido = bruto * 0.92;
        System.out.println(liquido);
        sc.close();
    }

}
