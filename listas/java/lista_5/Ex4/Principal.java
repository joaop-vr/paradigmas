import java.util.LinkedList;
import java.util.Collections;

public class Principal {
    public static void main(String args[]) {

        LinkedList<Professor> docentes = new LinkedList<Professor>();

        Professor prof1 = new Professor("Joao Pedro", 20224169);
        Professor prof2 = new Professor("Rita", 20204039);
        Professor prof3 = new Professor("Vitor", 20184539);
        Professor prof4 = new Professor("Sofia", 20234019);
        Professor prof5 = new Professor("Marta", 20124097);

        docentes.add(prof1);
        docentes.add(prof2);
        docentes.add(prof3);
        docentes.add(prof4);
        docentes.add(prof5);

        // Ordenar a lista por matrícula em ordem crescente
        Collections.sort(docentes);

        for (Professor prof : docentes) {
            System.out.println("Nome: " + prof.getNome());
            System.out.println("Matrícula: " + prof.getMatricula());
            System.out.println();
        }

        int matriculaParaBuscar = 20234019;
        Professor professorParaRemover = null;

        for (Professor prof : docentes) {
            if (prof.getMatricula() == matriculaParaBuscar) {
                professorParaRemover = prof;
                break;
            }
        }

        if (professorParaRemover != null) {
            docentes.remove(professorParaRemover);
            System.out.println("Professor removido com sucesso!");
        } else {
            System.out.println("Professor com a matrícula " + matriculaParaBuscar + " não encontrado.");
        }

        for (Professor prof : docentes) {
            System.out.println("Nome: " + prof.getNome());
            System.out.println("Matrícula: " + prof.getMatricula());
            System.out.println();
        }
    }
}
