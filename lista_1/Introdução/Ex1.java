import java.util.Scanner;

public class Ex1 {

    public static void main(String argv[]) {

        Scanner input = new Scanner(System.in);
        int x;

        System.out.println("\n***********************");
        System.out.print("\nDigite um número inteiro: ");
        x = input.nextInt();

        if ((x % 2) == 0)
            System.out.printf("O número %d é par.\n", x);
        else
            System.out.printf("O número %d é impar.\n", x);

        input.close();
    }
}