package EstruturaSequencial;

import java.util.Locale;

public class SaidaDeDados {
    public static void main(String[] args) {
        // Para escrever na tela um texto usamos os comandos:

        // System.out.println("Bom dia!"); - tem quebra de linha
        // System.out.print("Bom dia"); - Não possui quebra de linha

        System.out.print("Olá mundo!!");
        System.out.println("Bom dia!! ");

        double x = 10.35784;
        double y = 20.34246;

        // Usamos o printf para fazer a formatação de números decimais.
        // Assim podemos dizer quantos números vai ter depois do ponto.
        // A sintaxe é ("%.numero de casasf%n") - O %n é para quebrar linha.

        System.out.printf("%.4f%n", x);

        // Podemos usar também o String Format
        System.out.println(String.format("%.2f", x));

        // Ao usar o printf ou o String.format, ele vai pegar o formato do PC, no meu caso a lingua portuguesa.
        // Sendo assim temos que configurar para ele colocar o ponto ao invés da vírgula.
        // E para isso samos o Locale.setDefault, que é uma classe do JDK.

        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", y);

        // Para contatenar é só colocar variaveis com texto é só colocar o sinal de +
        System.out.println("Resultado = " + x + "Metros");

        // Para concatenar varios elementos em um mesmo comando de escrita, usando o printf
        System.out.printf("Resultado = %.2f metros%n", x); // O valor de x entra no lugar no %f

        // Mais exemplos

        String nome = "Maria";
        int idade = 20;
        double renda = 4000.0;

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

        // %d = Inteiro
        // %f = Ponto flutuante
        // %s = Texto
        // %n = Quebra de linha

    }
}