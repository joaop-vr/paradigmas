import java.util.Scanner;

public class Comp_ex3 {
    public static void main(String argv[]) {

        Scanner input = new Scanner(System.in);
        String palavra;
        char caracter;
        int a, e, i, o, u;

        System.out.println("\n*************************");
        System.out.print("Digite a frase: ");
        palavra = input.next();

        a = 0;
        e = 0;
        i = 0;
        o = 0;
        u = 0;
        for (int j = 0; j < palavra.length(); j++) {
            if (palavra.charAt(j) == 'a' || palavra.charAt(j) == 'A')
                a++;
            if (palavra.charAt(j) == 'e' || palavra.charAt(j) == 'E')
                e++;
            if (palavra.charAt(j) == 'i' || palavra.charAt(j) == 'I')
                i++;
            if (palavra.charAt(j) == 'o' || palavra.charAt(j) == 'O')
                o++;
            if (palavra.charAt(j) == 'u' || palavra.charAt(j) == 'U')
                u++;
        }

        System.out.println("\n*************************");
        System.out.println("Vogais: ");
        System.out.printf("a: %d\n", a);
        System.out.printf("e: %d\n", e);
        System.out.printf("i: %d\n", i);
        System.out.printf("o: %d\n", o);
        System.out.printf("u: %d\n", u);

        System.out.println("\n*************************");
        System.out.print("Digite o caracter para a substituição: ");
        caracter = input.next().charAt(0);

        String novaPalavra = palavra.replace('a', caracter).replace('A', caracter);
        System.out.printf("caracter: %c\nNova palavra: %s\n", caracter, novaPalavra);

        input.close();
    }
}
