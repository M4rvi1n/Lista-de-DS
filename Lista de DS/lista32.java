import java.util.Scanner;

public class lista32 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = (n * 3 + 1) + (n * 2 - 1);
        System.out.println(r);
        sc.close();
    }

}
