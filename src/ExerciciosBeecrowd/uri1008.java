package ExerciciosBeecrowd;

import java.util.Locale;
import java.util.Scanner;

public class uri1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double salarioHora = sc.nextDouble();

        double salario = horasTrabalhadas * salarioHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);
        sc.close();

    }
}
