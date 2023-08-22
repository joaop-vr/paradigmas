import java.util.Scanner;

public class Ex1 {

    public static void main(String args[]) {

        int idades[] = new int[10];
        Scanner input = new Scanner(System.in);
        float media = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Indique a idade: ");
            idades[i] = input.nextInt();
            media += idades[i];
        }

        media /= 10;

        System.out.println("\n*****************************\n");
        System.out.println("Média: " + media);
        System.out.println("\n*****************************\n");

        for (int i = 0; i < 10; i++) {
            if (idades[i] < media)
                System.out.printf("Idade: %d (abaixo da média)\n", idades[i]);
            else
                System.out.printf("Idade: %d (acima da média)\n", idades[i]);
        }
        input.close();
    }
}
