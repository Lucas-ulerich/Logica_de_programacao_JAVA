package ExerciciosBeecrowd;

import java.util.Locale;
import java.util.Scanner;

public class uri1005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble() * 3.5;
        double B = sc.nextDouble() * 7.5;

        double media = (A + B) / 11;

        System.out.printf("MEDIA = %.5f%n", media);

        sc.close();
    }
}
