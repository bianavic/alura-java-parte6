package br.com.bytebank.banco.modelo;


// transformar o GuardadorDeContas em um guardador de REFERENCIAS GENERICA

public class GuardadorDeReferencias {

    private Object[] referencias;

    private int posicaoLivre;

    public GuardadorDeReferencias() { // CONSTRUTOR
        this.referencias = new Object[10]; // inicializar array
        this.posicaoLivre = 0; // inicializar a variavel (explicita) | é um atributo default,
        // inicializado com 1 valor padrao, por isso nao necessario.
    }

    public void adiciona(Object ref) {

        this.referencias[0] = ref; // coloquei na posicao 0
        this.posicaoLivre++; // incrementar a variavel posicaoLivre para colocar na posicao livre, posicao seguinte.
    }

    public int getQuantidadeDeElementos() { // IMPLEMENTAR METODO para conseguir testar
        return 0;
    } // para saber o NUMERO de itens INICIALIZADOS (qtos elemento ele guardou)

    public Object getReferencias(int pos) {
        return this.referencias[pos];
    }

}
