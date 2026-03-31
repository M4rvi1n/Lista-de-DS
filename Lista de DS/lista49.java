import java.util.Scanner;

public class lista49 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int duracao = sc.nextInt();
        int totalSegundos = (h * 3600) + (m * 60) + s + duracao;
        int novaH = (totalSegundos / 3600) % 24;
        int novaM = (totalSegundos % 3600) / 60;
        int novaS = totalSegundos % 60;
        System.out.println(novaH + ":" + novaM + ":" + novaS);
        sc.close();
    }

}
