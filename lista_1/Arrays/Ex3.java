import java.util.Scanner;

class Constante {
    public static final int MAX_ALUNOS = 5; // Define o número de alunos
}

class Aluno {
    int notas[] = new int[4];

    public void registrar(int n1, int n2, int n3, int n4) {
        this.notas[0] = n1;
        this.notas[1] = n2;
        this.notas[2] = n3;
        this.notas[3] = n4;
    }

    public int mostrarMaior() {
        int maior = this.notas[0];
        for (int i = 0; i < 4; i++) {
            if (this.notas[i] > maior)
                maior = this.notas[i];
        }
        return maior;
    }
}

public class Ex3 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        Aluno turma[] = new Aluno[Constante.MAX_ALUNOS];

        for (int i = 0; i < Constante.MAX_ALUNOS; i++) {
            int n1, n2, n3, n4;
            turma[i] = new Aluno();

            System.out.print("\n********************\n\n");
            System.out.printf("Informe as 4 notas do Aluno %d\n", i);

            System.out.print("Nota 1: ");
            n1 = input.nextInt();
            System.out.print("Nota 2: ");
            n2 = input.nextInt();
            System.out.print("Nota 3: ");
            n3 = input.nextInt();
            System.out.print("Nota 4: ");
            n4 = input.nextInt();

            turma[i].registrar(n1, n2, n3, n4);

        }

        System.out.print("\n********************\n\n");
        System.out.println("Maiores Notas\n");
        for (int i = 0; i < Constante.MAX_ALUNOS; i++) {
            System.out.printf("Aluno %d -> nota:%d\n", i, turma[i].mostrarMaior());
        }

        input.close();
    }
}
