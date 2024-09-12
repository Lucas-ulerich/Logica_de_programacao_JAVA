package EstruturaSequencial;

public class TypeCasting {
    public static void main(String[] args) {
        int x;
        double y;
        x = 5;

        y = 2 * x;

        System.out.println(x);
        System.out.println(y);
        System.out.println();

        System.out.println("Primeiro exemplo");
        double  b, B, h, area;

        b = 6.0;
        B = 8.0;
        h =5.0;
        area = (b + B) / 2.0 * h;

        System.out.println(area);
        System.out.println();

        System.out.println("Segundo exemplo");

        int c, d;
        double resultado;

        c = 5;
        d = 2;
        // Para fazer o casting é só colocar o tipo do dado entre parenteses antes da operação.
        resultado = (double)c / d;
        System.out.println(resultado);

        System.out.println();
        System.out.println("Terceiro exemplo");

        double s;
        int f;

        s = 5.0;
        f = (int) s; // Nesse caso se não fizer o casting ele não conseguiria fazer a atribuição de 5.0
        // na variavel s

        System.out.println(f);

    }
}
