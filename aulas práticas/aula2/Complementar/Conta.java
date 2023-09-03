import java.util.Scanner;

public class Conta {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        contaBancaria vetor[] = new contaBancaria[5];
        String nome;
        int k, numConta, saldo, op;
        float saque, deposito, taxa;

        System.out.println("\n*************************");

        k = 1;
        for (int i = 0; i < 5; i++) {

            System.out.print("\nNome:");
            nome = input.next();
            System.out.print("Número da conta:");
            numConta = input.nextInt();
            System.out.print("Saldo:");
            saldo = input.nextInt();

            if (k <= 3) {   // instancia os 3 primeiros indices como objetos do tipo conta poupança
                int dia;
                System.out.print("Dia de rendimento:");
                dia = input.nextInt();
                try {
                    vetor[i] = new contaPoupanca(nome, numConta, saldo, dia);
                } catch (IllegalArgumentException erro) {
                    System.out.println("Erro: " + erro.getMessage());
                }
                
                k++;
            }
            else {          // instancia os 2 últimos indices como objetos do tipo conta especial
                int limite;
                System.out.print("Limite:");
                limite = input.nextInt();
                try {
                    vetor[i] = new contaEspecial(nome, numConta, saldo, limite);
                } catch (IllegalArgumentException erro) {
                    System.out.println("Erro: " + erro.getMessage()); 
                }
            }
        }

        
        System.out.print("\nInforme o número da conta que deseja realizar a operação:");
        numConta = input.nextInt();

        System.out.print("Selecione a operação: \n1) Sacar \n2)Depositar \n3) Calcular novo saldo\n");
        op = input.nextInt();

        for (int i = 0; i < 5; i++) {
            if(vetor[i].getNumconta() == numConta) {
                switch (op) {
                    case 1:
                        System.out.print("\nInforme a quantia de saque:");
                        saque = input.nextInt();
                        vetor[i].sacar(saque);
                        break;
                    
                    case 2:
                        System.out.print("\nInforme a quantia de depósito:");
                        deposito = input.nextInt();
                        vetor[i].depositar(deposito);
                        break;

                    case 3:
                        if (vetor[i] instanceof contaPoupanca) {
                            System.out.print("\nInforme a taxa de rendimento:");
                            taxa = input.nextInt();
                            ((contaPoupanca) vetor[i]).calcularNovoSaldo(taxa); // Chamada do método dentro do if
                        } else {
                            System.out.print("\nErro! Sua conta não possui esta funcionalidade.");
                        }
                        break;
                    default:
                        System.out.print("\nErro! Operação inválida.");
                        break;
                }
                System.out.println("Novo saldo: " + vetor[i].getSaldo());
            }
        }
        input.close();
    }
}
