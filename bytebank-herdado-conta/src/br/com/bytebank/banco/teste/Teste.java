package br.com.bytebank.banco.teste;

public class Teste {

    // ARRAY [] => estrutura de dados
    // 1 array tb é 1 objeto
    public static void main(String[] args) {

        // ARRAY = sao colchetes associados a 1 conjunto de dados
        // colchetes pode ser apos variavel ou depois do tipo
        // precisa informar o tamnaho do array
        int[] idades = new int[5]; // o tipo de dado é 'int'

        for(int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
        }

        for(int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

    }
}
