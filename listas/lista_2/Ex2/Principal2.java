import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m1, m2, h1, h2;

        System.out.println("\n*************************");
        System.out.println("Digite o 1º horário ");
        System.out.print("Horas: ");
        h1 = input.nextInt();
        System.out.print("Minutos: ");
        m1 = input.nextInt();
        Time horario1 = new Time(h1, m1);

        System.out.println("\n*************************");
        System.out.println("Digite o 2º horário ");
        System.out.print("Horas: ");
        h2 = input.nextInt();
        System.out.print("Minutos: ");
        m2 = input.nextInt();
        Time horario2 = new Time(h2, m2);

        System.out.println("\n*************************");
        System.out.printf("Primeiro horário: %s\n", horario1.toString());
        System.out.printf("Segundo horário: %s\n", horario2.toString());

        if (horario1.anterior(h2, m2)) {
            System.out.println("\n\nO segundo horário é anterior ao primeiro.\n");
        } else if (horario1.posterior(h2, m2)) {
            System.out.println("\n\nO segundo horário é posterior ao primeiro.\n");
        } else {
            System.out.println("\n\nO segundo horário é igual ao primeiro.\n");
        }

        input.close();
    }
}
