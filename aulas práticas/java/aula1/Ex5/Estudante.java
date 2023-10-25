public class Estudante {
    
    private String nome;
    private float notaFinal;

    public Estudante(){}

    public void setNome (String nome) {
        if (nome.length() > 0) {
            this.nome = nome;
        }
    }

    public String getNome () {
        return this.nome;
    }

    public void setNotaFinal (float nota) {
        if ((1 <= nota) && (nota <= 100)) {
            this.notaFinal = nota;
        }
    }

    public float getNotaFinal () {
        return this.notaFinal;
    }

    @Override
    public String toString() {
        return String.format("Estudante: %s\nNota final: %1.2f\n", getNome(), getNotaFinal());
    }
}