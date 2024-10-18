package ExerciciosBeecrowd;

import java.util.Scanner;

public class uri1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int duracaoJogo;

        if (horaInicial < horaFinal) {
            duracaoJogo = horaFinal - horaInicial;
        } else {
            duracaoJogo = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracaoJogo + " HORA(S)");
    }
}
