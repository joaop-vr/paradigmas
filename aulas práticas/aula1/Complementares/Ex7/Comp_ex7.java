import java.util.Scanner;

public class Comp_ex7 {
    public static void main(String argv[]) {

        Scanner input = new Scanner(System.in);
        String frase1, frase2;

        System.out.println("\n*************************");
        System.out.print("Digite a 1ª frase: ");
        frase1 = input.nextLine();
        System.out.print("Digite a 2ª frase: ");
        frase2 = input.nextLine();

        frase1 = frase1.replace('a', '*').replace('A', '*');
        frase2 = frase2.replace('a', '*').replace('A', '*');

        // Usando StringBuilder para inverter a string
        StringBuilder reversedBuilder = new StringBuilder(frase1);
        String frase1Invertida = reversedBuilder.reverse().toString();

        reversedBuilder = new StringBuilder(frase2);
        String frase2Invertida = reversedBuilder.reverse().toString();

        System.out.println("\n*************************");
        System.out.printf("1ª frase: %s\n", frase1Invertida);
        System.out.printf("2ª frase: %s\n", frase2Invertida);

        input.close();
    }
}
