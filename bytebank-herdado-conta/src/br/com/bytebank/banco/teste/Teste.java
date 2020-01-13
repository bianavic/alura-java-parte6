package br.com.bytebank.banco.teste;

public class Teste {

    // dentro da ARRAY pode conter referencias, mas nao ha primitivos
    // o valor padrao de 1 primitivo é ZERO
    // ARRAY [] => estrutura de dados
    // 1 array tb é 1 objeto
    // STRING é uma CLASSE, é um TIPO
    public static void main(String[] args) {

        // ARRAY = sao colchetes associados a 1 conjunto de dados
        // colchetes pode ser apos variavel ou depois do tipo
        // precisa informar o tamanho do array
        int[] idades = new int[5]; // o tipo de dado é 'int'

        for(int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
        }

        for(int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

    }
}
