# Lista-de-DS

# Lista 1
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
# Lista 2
import java.util.Scanner;

public class lista2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero = scanner.nextDouble();
        System.out.println(numero);

        scanner.close();
    }
}
# Lista 3
import java.util.Scanner;

public class lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceiro número inteiro: ");
        int num3 = scanner.nextInt();

        int soma = num1 + num2 + num3;

        System.out.println("A soma dos três números inteiro é: " + soma);

        scanner.close();

    }
}

# Lista 4
import java.util.Scanner;

public class lista4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        double numero = scanner.nextDouble();

        double quadrado = numero * numero;

        System.out.println("O quadrado do número é: " + quadrado);

        scanner.close();
    }
}
# Lista 5
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
# Lista 6
import java.util.Scanner;

public class lista6 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a temperatura em graus Celsius: ");
    double celsius = scanner.nextDouble();

    double fahrenheit = celsius * (9.0 / 5.0) + 32.0;

    System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

    scanner.close();
    }
}

# Lista 7
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

# Lista 8
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
# Lista 9
import java.util.Scanner;

public class lista9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double k = c + 273.15;
        System.out.println(k);
        sc.close();
    }
}
# Lista 10
import java.util.Scanner;

public class lista10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kmh = sc.nextDouble();
        double ms = kmh / 3.6;
        System.out.println(ms);
        sc.close();
    }
}
# Lista 11
import java.util.Scanner;

public class lista11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ms = sc.nextDouble();
        double kmh = ms * 3.6;
        System.out.println(kmh);
        sc.close();
    }
}
# Lista 12
import java.util.Scanner;

public class lista12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double milhas = sc.nextDouble();
        double km = milhas * 1.61;
        System.out.println(km);
        sc.close();
    }
}
# Lista 13
import java.util.Scanner;

public class lista13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double milhas = km / 1.61;
        System.out.println(milhas);
        sc.close();
    }
} 
# Lista 14
import java.util.Scanner;

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double milhas = km / 1.61;
        System.out.println(milhas);
        sc.close();
    }
}
# Lista 15
import java.util.Scanner;

public class lista15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rad = sc.nextDouble();
        double graus = rad * 180 / 3.14;
        System.out.println(graus);
        sc.close();
    }
}
# Lista 16
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
# Lista 17
import java.util.Scanner;

public class lista17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cm = sc.nextDouble();
        double p = cm / 2.54;
        System.out.println(p);
        sc.close();
    }
}
# Lista 18
import java.util.Scanner;

public class lista18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        double l = m * 1000;
        System.out.println(l);
        sc.close();
    }
}
# Lista 19
import java.util.Scanner;

public class lista19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double m = l / 1000;
        System.out.println(m);
        sc.close();
    }
}
# Lista 20
import java.util.Scanner;

public class lista20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double k = sc.nextDouble();
        double l = k / 0.45;
        System.out.println(l);
        sc.close();
    }
}
# Lista 21
import java.util.Scanner;

public class lista21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double k = l * 0.45;
        System.out.println(k);
        sc.close();
    }
}
# Lista 22
import java.util.Scanner;

public class lista22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double j = sc.nextDouble();
        double m = 0.91 * j;
        System.out.println(m);
        sc.close();
    }
}
# Lista 23
import java.util.Scanner;

public class lista23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        double j = m / 0.91;
        System.out.println(j);
        sc.close();
    }
}
# Lista 24
import java.util.Scanner;

public class lista24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        double a = m * 0.000247;
        System.out.println(a);
        sc.close();
    }
}
# Lista 25
import java.util.Scanner;

public class lista25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double m = a * 4048.58;
        System.out.println(m);
        sc.close();
    }
}
# Lista 26
import java.util.Scanner;

public class lista26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        double h = m * 0.0001;
        System.out.println(h);
        sc.close();
    }
}
# Lista 27
import java.util.Scanner;

public class lista27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble();
        double m = h * 10000;
        System.out.println(m);
        sc.close();
    }
}
# Lista 28
import java.util.Scanner;

public class lista28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double r = a*a + b*b + c*c;
        System.out.println(r);
        sc.close();
    }
}
# Lista 29
import java.util.Scanner;

public class lista29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();
        double m = (n1 + n2 + n3 + n4) / 4;
        System.out.println(m);
        sc.close();
    }
}
# Lista 30
import java.util.Scanner;

public class lista30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double real = sc.nextDouble();
        double cot = sc.nextDouble();
        double dol = real / cot;
        System.out.println(dol);
        sc.close();
    }
}
# Lista 31 
import java.util.Scanner;

public class lista31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n - 1);
        System.out.println(n + 1);
        sc.close();
    }
}
# Lista 32 
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
# Lista 33
import java.util.Scanner;

public class lista33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double a = l * l;
        System.out.println(a);
        sc.close();
    }
}
# Lista 34
import java.util.Scanner;

public class lista34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double a = 3.141592 * r * r;
        System.out.println(a);
        sc.close();
    }
}
# Lista 35
import java.util.Scanner;

public class lista35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double h = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println(h);
    }
}
# Lista 36
import java.util.Scanner;

public class lista36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura = sc.nextDouble();
        double raio = sc.nextDouble();
        double v = Math.PI * Math.pow(raio, 2) * altura;
        System.out.println(v);
    }
}
# Lista 37 
import java.util.Scanner;

public class lista37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();
        double resultado = valor * 0.88;
        System.out.println(resultado);
    }
}
# Lista 38
import java.util.Scanner;

public class lista38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        double novoSalario = salario * 1.25;
        System.out.println(novoSalario);
    }
}
# Lista 39
public class lista39 {
    public static void main(String[] args) {
        double total = 780000.00;
        double g1 = total * 0.46;
        double g2 = total * 0.32;
        double g3 = total - g1 - g2;
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
    }
}
# Lista 40
import java.util.Scanner;

public class lista40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dias = sc.nextInt();
        double bruto = dias * 30.00;
        double liquido = bruto * 0.92;
        System.out.println(liquido);
    }
}
# Lista 41
import java.util.Scanner;

public class lista41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorHora = sc.nextDouble();
        double horas = sc.nextDouble();
        double total = (valorHora * horas) * 1.10;
        System.out.println(total);
    }
}
# Lista 42
import java.util.Scanner;

public class lista42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double gratificacao = base * 0.05;
        double imposto = base * 0.07;
        double finalSalario = base + gratificacao - imposto;
        System.out.println(finalSalario);
    }
}
# Lista 43
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
    }
}
# Lista 44
import java.util.Scanner;

public class lista44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double alturaDesejada = sc.nextDouble();
        double alturaDegrau = sc.nextDouble();
        double total = alturaDesejada / alturaDegrau;
        System.out.println(Math.ceil(total));
    }
}
# Lista 45
import java.util.Scanner;

public class lista45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra = sc.next().charAt(0);
        char minuscula = (char) (letra + 32);
        System.out.println(minuscula);
    }
}
# Lista 46
import java.util.Scanner;

public class lista46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int centena = numero / 100;
        int resto = numero % 100;
        int dezena = resto / 10;
        int unidade = resto % 10;
        System.out.println("" + unidade + dezena + centena);
    }
}
# Lista 47
import java.util.Scanner;

public class lista47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        System.out.println(numero / 1000);
        System.out.println((numero % 1000) / 100);
        System.out.println((numero % 100) / 10);
        System.out.println(numero % 10);
    }
}
# Lista 48
import java.util.Scanner;

public class lista48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSegundos = sc.nextInt();
        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
# Lista 49
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
    }
}
# Lista 50
import java.util.Scanner;

public class lista50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        int anoAtual = sc.nextInt();
        System.out.println(anoAtual - idade);
    }
}
# Lista 51
import java.util.Scanner;

public class lista51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println(d);
    }
}
# Lista 52
import java.util.Scanner;

public class lista52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a1 = sc.nextDouble();
        double a2 = sc.nextDouble();
        double a3 = sc.nextDouble();
        double premio = sc.nextDouble();
        
        double totalAposta = a1 + a2 + a3;
        
        System.out.println((a1 / totalAposta) * premio);
        System.out.println((a2 / totalAposta) * premio);
        System.out.println((a3 / totalAposta) * premio);
    }
}
# Lista 53
import java.util.Scanner;

public class lista53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double l = sc.nextDouble();
        double p = sc.nextDouble();
        double custo = 2 * (c + l) * p;
        System.out.println(custo);
    }
}
