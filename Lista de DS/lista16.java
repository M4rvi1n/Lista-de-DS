import java.util.Scanner;

public class lista16 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double polegadas = sc.nextDouble();
        double cm = polegadas * 2.54;
        System.out.println(cm);
        sc.close();
    }

}
