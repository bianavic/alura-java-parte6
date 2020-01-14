// utilizar ARRAYS mais genericos
// nosso array guarda referencias do tipo conta

package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;
import sun.lwawt.macosx.*;

public class TesteArrayReferencias {

    public static void main(String[] args) {

        // Simplificar codigo apenas com o TIPO Conta
        // mas é preciso importar Conta
        Conta[] contas = new Conta[5];

        // array + generico == Object[] para guardar todos os tipos: Conta Cliente Agencia etc
        ContaCorrente cc1 = new ContaCorrente(22, 11); // objeto criado E referencia pronta.
        contas[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22, 22); // novo objeto criado
        contas[1] = cc2;

        // System.out.println(cc2.getNumero());

        System.out.println( contas[1].getNumero());
        System.out.println( contas[0].getNumero());

        // nao consigo apontar tipo ContaCorrente ref
        // nem ContaCorrente nem para ContaPoupanca
        // ContaCorrente ref= contas[1];
        // Conta ref = contas[1];

        // No exe. abaixo o computador nao compila porque ele olha no
        // TIPO do ARRAY que é mais generico (que no caso é Conta)
        // ContaPoupanca ref = conta[1]; // para este exemplo funfar eu preciso fazer 1 cast
        // CAST de referencia (Type cast) === transformo de uma referencia do tipo mais gererico para um tipo mais especifico
        ContaPoupanca ref = (ContaPoupanca) contas[1]; // IMPOE ao computador que ele compile desta forma
        System.out.println(ref.getNumero());
    }
}
