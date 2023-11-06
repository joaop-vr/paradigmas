import java.util.Scanner;

public class Ex2 {
    public static void main(String argv[]) {

        Scanner input = new Scanner(System.in);
        String nome, sobrenome, tokens[];
        char inicial;

        System.out.print("Digite o nome: ");

        nome = input.nextLine();
        tokens = nome.split(" ");
        sobrenome = tokens[tokens.length - 1];
        inicial = nome.charAt(0);

        System.out.printf("Formatado: %s, %c.", sobrenome, inicial);

        input.close();
    }
}
