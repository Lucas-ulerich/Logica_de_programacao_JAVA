package EstruturaSequencial.ExerciciosURI;

import java.util.Locale;
import java.util.Scanner;

public class uri1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble() * 2;
        double B = sc.nextDouble() * 3;
        double C = sc.nextDouble() * 5;

        double media = (A + B + C) / 10;

        System.out.printf("MEDIA = %.1f%n", media);
        sc.close();
    }
}
