package br.com.bytebank.banco.teste;

public class Teste {

    // ARRAY [] => estrutura de dados
    // 1 array tb é 1 objeto
    public static void main(String[] args) {

        // ARRAY = sao colchetes associados a 1 conjunto de dados
        // colchetes pode ser apos variavel ou depois do tipo
        // precisa informar o tamnaho do array
        int[] idades = new int[5]; // o tipo de dado é 'int'
        // e qdo inicializa ja comeca com os valores padroes == ZERO

        idades[0] = 29;
        idades[1] = 39;
        idades[2] = 49;
        idades[3] = 59;
        idades[4] = 69;

        // representar 1 conjunto de dados
        int idade1 = idades[4];

        System.out.println(idade1);
        System.out.println(idades.length);

    }
}
