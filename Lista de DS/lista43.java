import java.util.Scanner;

public class lista43 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();
        
        double aVista = valor * 0.90;
        double parcela = valor / 3;
        double comissaoVista = aVista * 0.05;
        double comissaoParcela = valor * 0.05;
        
        System.out.println(aVista);
        System.out.println(parcela);
        System.out.println(comissaoVista);
        System.out.println(comissaoParcela);
        sc.close();
    }

}
