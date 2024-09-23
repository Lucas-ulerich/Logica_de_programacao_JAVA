package EstruturaCondicional;

import com.sun.security.jgss.GSSUtil;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double media = (nota1 + nota2);

        if (media > 60) {
            System.out.printf("Nota final: %.1f%n ", media);
            System.out.println("APROVADO");
        } else {
            System.out.printf("Nota final: %.1f%n ", media);
            System.out.println("REPROVADO");
        }
    }
}
