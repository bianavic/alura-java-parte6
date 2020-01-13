// CONTAS = 2 (NEW + NEW)
// OBJETOS = 3 (NEW + NEW = NEW), 1 desses objetos é o ARRAY
// REFERENCIAS = 9 (contas + cc1 + cc2 + ref) + dentro do ARRAY (cc1 + cc2 + null + null + null)
// destas, apenas 6 foram inicializadas
// INICIALIZADAS = 6 (contas + cc1 + cc2 + ref) + dentro do ARRAY (cc1 + cc2)
// NAO INICIALIZADAS = 3 (null + null + null)

package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import sun.lwawt.macosx.*;

public class TesteArrayReferencias {

    public static void main(String[] args) {
        // arrays sao OBJETOS e tem TAMANHO fixo
        // array de referencias é para estarmos preparados caso surja a necessidade de armazenamos diversas contas

        // int[] idades = new int[5];

        // guardar 10 contas correntes
        // NEW => indicacao de que estamos criando um OBJETO que pode guardar 5 referencias de contas
        // CC é TIPO, a Classe. Qdo criamos esse tipo,
        // o valor padrao de uma REFERENCIA é NULL
        ContaCorrente[] contas = new ContaCorrente[5];
        // Armazeno uma copia de cc1, ela sera uma segunda referencia APONTANDO para meu OBJETO
        ContaCorrente cc1 = new ContaCorrente(22, 11); // objeto criado E referencia pronta.
        // acessar a primeira posicao do meu array
        contas[0] = cc1; // GUARDEI a copia do cc1 que aponta para meu objeto

        ContaCorrente cc2 = new ContaCorrente(22, 22); // novo objeto criado
        contas[1] = cc2; // acessar a segunda posicao atribuindo cc2

        // System.out.println(cc2.getNumero());
        System.out.println( contas[1].getNumero()); // quero acessar referência ao array,
        // utilizando a palavra contas, e incluir a posição que desejamos acessar
        System.out.println( contas[0].getNumero()); // acessar a posicao ZERO
        // System.out.println( contas[2].getNumero()); // NULLpointer EXCEcao

        // DESMEMBRAR A LINHA: objeto + valor da variavel com a REFERENCIA ref
        ContaCorrente ref= contas[1]; // devolve uma REFERENCIA do TIPO ContaCorrente que aponta para o OBJETO
        System.out.println(ref.getNumero()); // === System.out.println(cc2.getNumero());
        System.out.println(cc2.getNumero());
    }
}
