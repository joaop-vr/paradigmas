import java.util.Scanner;

public class Principal {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int matricula, dia, mes, ano, salario, valorHora, numHoras;
        String nome, aux;
        boolean gringo;
        
        System.out.println("\n*************************");
        System.out.println("Funcionário Horista");
        System.out.print("nome: ");
        nome = input.nextLine();
        System.out.print("matricula: ");
        matricula = input.nextInt();
        System.out.print("dia de contratação: ");
        dia = input.nextInt();
        System.out.print("mes de contratação: ");
        mes = input.nextInt();
        System.out.print("ano de contratação: ");
        ano = input.nextInt();
        System.out.print("é estrangeiro: ");
        aux = input.next();
        gringo = aux.equalsIgnoreCase("Sim");
        System.out.print("numero de horas trabalhadas: ");
        numHoras = input.nextInt();
        System.out.print("salario por hora: ");
        valorHora = input.nextInt();

        funcionarioHorista pessoa1 = new funcionarioHorista(nome, matricula, dia, mes, ano, gringo, valorHora, numHoras);
        System.out.println("\n\n" + pessoa1.toString() + "\nsaláio fina: " + pessoa1.calcularSalarioFinal());
        
        System.out.println("\n*************************");
        System.out.println("Funcionário Mensalista");
        System.out.print("nome: ");
        nome = input.next();
        System.out.print("matricula: ");
        matricula = input.nextInt();
        System.out.print("dia de contratação: ");
        dia = input.nextInt();
        System.out.print("mes de contratação: ");
        mes = input.nextInt();
        System.out.print("ano de contratação: ");
        ano = input.nextInt();
        System.out.print("é estrangeiro: ");
        aux = input.nextLine();
        gringo = aux.equalsIgnoreCase("Sim");
        System.out.print("salario mensal: ");
        salario = input.nextInt();

        funcionarioMensalista pessoa2 = new funcionarioMensalista(nome, matricula, dia, mes, ano, gringo, salario);
        System.out.println("\n\n" + pessoa2.toString() + "salário final: " + pessoa2.calcularSalarioFinal());
        input.close();
    }
}