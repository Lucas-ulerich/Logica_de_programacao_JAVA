package EstruturaSequencial;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        // Para fazer entrada de dados no java, usamos um objeto do tipo "Scanner "

        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println("Você digitou: " + x);

        // Para armazernar número inteiro, usamos o sc.nextint();

        int y;
        y = sc.nextInt();
        System.out.println("Você digitou: " + y);

        // Para armazernar número com ponto flutuante, usamos o sc.nextDouble();
        // Ele vai pegar a localidade do sistema, no meu caso ele vai pegar a virgula.
        // Pois minha localidade é Brasil

        double c;
        c = sc.nextDouble();
        System.out.println("Você digitou: " + c);
        // Mesmo digitando com vírgula, ele imprimiu com ponto flutuante, pois o println pega a localidade independente do sistema.

        char z;
        z = sc.next().charAt(0);
        System.out.println("Você digitou: " + z);

        // Ler varios dados na mesma linha

        String b;
        int n;
        double m;

        b = sc.next();
        n = sc.nextInt();
        m = sc.nextDouble();

        System.out.println(b);
        System.out.println(n);
        System.out.println(m);

        sc.close();
    }
}
