package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {

    private Conta[] referencias;

    private int posicaoLivre;

    public GuardadorDeContas() { // CONSTRUTOR
        this.referencias = new Conta[10]; // inicializar array
        this.posicaoLivre = 0; // inicializar a variavel (explicita) | é um atributo default,
        // inicializado com 1 valor padrao, por isso nao necessario.
    }

    public void adiciona(Conta ref) {

        this.referencias[0] = ref; // coloquei na posicao 0
        this.posicaoLivre++; // incrementar a variavel posicaoLivre para colocar na posicao livre, posicao seguinte.
    }

    public int getQuantidadeDeElementos() { // IMPLEMENTAR METODO para conseguir testar
        return 0;
    } // para saber o NUMERO de itens INICIALIZADOS (qtos elemento ele guardou)

    public Conta getReferencias(int pos) {
        return this.referencias[pos];
    }
}
