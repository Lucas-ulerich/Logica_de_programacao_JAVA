package EstruturaSequencial;

import java.util.Scanner;

public class EntradaDeDadosParte2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        // O comando sc.nextLine() nos permite ler a linha inteira, difetente no next() que lê apenas uma palavra.

        // Se não colocar um nextLine extra, o s1 vai consumir a quebra de linha do nextInt. Isso pode acontecer para qualuqer um que não seja o nextLine.
        x = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine(); // O nextLine não pega numeros
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados Digitados:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
