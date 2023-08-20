public class Ex2 {
    public static void main(String argv[]) {

        int i, cont, soma;

        i = 0;
        cont = 0;
        soma = 0;

        while (cont < 10) {
            if ((i % 3) == 0) {
                System.out.println("Número: " + i);
                soma += i;
                cont++;
            }

            i++;
        }

        System.out.println("Soma: " + soma);
    }
}
