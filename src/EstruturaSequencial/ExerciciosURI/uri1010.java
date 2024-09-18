package EstruturaSequencial.ExerciciosURI;

import java.util.Locale;
import java.util.Scanner;

public class uri1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroPeca1 = sc.nextInt();
        int quantidadePeca1 = sc.nextInt();
        double valorPeca1 = sc.nextDouble();

        int numeroPeca2 = sc.nextInt();
        int quantidadePeca2 = sc.nextInt();
        double valorPeca2 = sc.nextDouble();

        double pagamento = (quantidadePeca1 * valorPeca1) + (quantidadePeca2 * valorPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", pagamento);

    }
}
