import java.util.Comparator;

public class Professor implements Comparable<Professor> {

    private String nome;
    private int matricula;

    public Professor() {
    }

    public Professor(String nome, int matricula) {
        this.setNome(nome);
        this.setMatricula(matricula);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return this.matricula;
    }

    @Override
    public int compareTo(Professor outroProfessor) {
        if (this.matricula < outroProfessor.matricula)
            return -1;
        else if (this.matricula == outroProfessor.matricula)
            return 0;
        else
            return 1;
    }

}
