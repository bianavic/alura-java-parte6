// utilizar ARRAYS mais genericos
// nosso array guarda referencias do tipo conta
// guarda referencias do tipo + generico que conta == tipo Object[]

package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;
import sun.lwawt.macosx.*;

public class TesteArrayReferencias {

    public static void main(String[] args) {

        // array + generico == Object[] para guardar todos os tipos: Conta, Cliente etc
        Object[] referencias = new Object[5];

        ContaCorrente cc1 = new ContaCorrente(22, 11); // objeto criado E referencia pronta.
        referencias[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22, 22); // novo objeto criado
        referencias[1] = cc2;

        // System.out.println(cc2.getNumero());

        Cliente cliente = new Cliente();
        // acessar a segunda posicao do indice 1
        referencias[2] = cliente;

        // usar a referencia generica para chamar o metodo getNumero()
        // Object.referenciaGenerica = referencias[1];

        // para funcionar abaixo preciso transformar a referencia generica num
        // tipo especifico, vamos refatorar referencias para tipo referencias
        // System.out.println( referenciaGenerica.getNumero());


        // System.out.println( referencias[0].getNumero());

        // nao consigo apontar tipo ContaCorrente ref
        // nem ContaCorrente nem para ContaPoupanca
        // ContaCorrente ref= referencias[1];
        // Conta ref = referencias[1];

        // No exe. abaixo o computador nao compila porque ele olha no
        // TIPO do ARRAY que é mais generico (que no caso é Conta)
        // ContaPoupanca ref = conta[1]; // para este exemplo funfar eu preciso fazer 1 cast
        // CAST de referencia (Type cast) === transformo de uma referencia do tipo mais gererico para um tipo mais especifico
        ContaPoupanca ref = (ContaPoupanca) referencias[1]; // IMPOE ao computador que ele compile desta forma

        // erro: excecao class cast exception
        // ContaCorrente ref = (ContaCorrente) referencias[1]; //type cast

        System.out.println(ref.getNumero());
    }
}
