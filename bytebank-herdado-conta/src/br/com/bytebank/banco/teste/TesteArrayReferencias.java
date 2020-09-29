// ADAPTER PARA ARRAYS

package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteArrayReferencias {

    public static void main(String[] args) {

        Object[] referencias = new Object[5];

        ContaCorrente cc1 = new ContaCorrente(22, 11); // objeto criado E referencia pronta.
        referencias[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22, 22); // novo objeto criado
        referencias[1] = cc2;

        Cliente cliente = new Cliente();
        // acessar a segunda posicao do indice 1
        referencias[2] = cliente;

        ContaPoupanca ref = (ContaPoupanca) referencias[1]; // IMPOE ao computador que ele compile desta forma


        System.out.println(ref.getNumero());
    }
}
