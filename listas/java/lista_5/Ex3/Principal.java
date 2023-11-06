import java.util.TreeSet;

public class Principal {
    public static void main(String args[]) {

        TreeSet<AlunoMonitor> monitoria = new TreeSet<AlunoMonitor>();

        AlunoMonitor aluno1 = new AlunoMonitor("Joao Pedro", 20224169, 1062);
        AlunoMonitor aluno3 = new AlunoMonitor("Vitor", 20184539, 182);
        AlunoMonitor aluno2 = new AlunoMonitor("Sofia", 2023401099, 182);

        monitoria.add(aluno1);
        monitoria.add(aluno2);
        monitoria.add(aluno3);

        for (AlunoMonitor aluno : monitoria) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println("Código da Disciplina: " + aluno.getCodigoDisciplina());
            System.out.println();
        }
    }
}
