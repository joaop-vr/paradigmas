import java.util.Scanner;

public class Ex4 {
    public static void main(String argv[]) {

        Scanner input = new Scanner(System.in);
        float altura, peso;
        int cont;

        altura = 0;
        peso = 0;
        cont = 0;

        while ((altura != -1) && (peso != -1)) {
            System.out.println("\n*****************************");
            System.out.print("\nAltura: ");
            altura = input.nextFloat();
            System.out.print("Peso: ");
            peso = input.nextFloat();

            if ((altura != -1) && (peso != -1)) {
                if ((peso / (altura * altura)) <= 25)
                    cont++;
            }

        }

        System.out.println("Número de pessoas que estão no suposto \"peso normal\": " + cont);

        input.close();
    }
}
