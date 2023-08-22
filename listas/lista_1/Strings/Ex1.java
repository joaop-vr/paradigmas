import java.util.Scanner;

public class Ex1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String frase, tokens[];
        int tam;

        System.out.print("Digite a frase: ");

        frase = input.nextLine();
        tokens = frase.split(" ");
        tam = tokens.length;

        System.out.printf("A frase tem %d palavras.\n", tam);

        input.close();
    }
}
