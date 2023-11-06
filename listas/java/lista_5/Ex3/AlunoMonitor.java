import java.util.Comparator;

public class AlunoMonitor implements Comparable<AlunoMonitor> {

    private String nome;
    private int matricula;
    private int codigoDisciplina;

    public AlunoMonitor() {
    }

    public AlunoMonitor(String nome, int matricula, int codigo) {
        this.setNome(nome);
        this.setMatricula(matricula);
        this.setCodigoDisciplina(codigo);
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

    public void setCodigoDisciplina(int codigo) {
        this.codigoDisciplina = codigo;
    }

    public int getCodigoDisciplina() {
        return this.codigoDisciplina;
    }

    @Override
    public int compareTo(AlunoMonitor outroAluno) {
        return this.nome.compareTo(outroAluno.nome);
    }
}
