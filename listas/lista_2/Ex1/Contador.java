public class Contador {

    int contagem;

    public Contador() {
        this.contagem = 0;
    }

    // Construtor com parâmetros
    public Contador(int i) {
        this.contagem = i;
    }

    public void setContagem(int contagem) {
        this.contagem = contagem;
    }

    public int getContagem() {
        return contagem;
    }

    public void zerar() {
        this.contagem = 0;
    }

    public void incrementar() {
        this.contagem++;
    }

    public void decrementar() {
        if (this.contagem > 0)
            this.contagem--;
    }
}

/*
 * *****************************************************
 * 
 * Exemplos de classes que poderiam ter como atributo um contador desse tipo de
 * classe são:
 * 
 * 1) CarrinhoDeCompras: para registrar a quantidade de itens que estão
 * no carrinho
 * 
 * 2) ContadorDeCliques: para que controlar o número de cliques
 * 
 * 3) ContadorDeEstoque: para gerenciar o estoque de produtos em uma loja
 * 
 * 4) ContadorDeNotificações: Uma classe que mantém um contador das notificações
 * não lidas em um aplicativo ou sistema de mensagens.
 * 
 * 5) ContadorDeVotos: Uma classe que registra a contagem de votos para
 * diferentes opções em uma enquete.
 * 
 */
