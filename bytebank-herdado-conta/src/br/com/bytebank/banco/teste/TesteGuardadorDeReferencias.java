package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteGuardadorDeReferencias {

    public static void main(String[] args) {
        GuardadorDeReferencias guardador = new GuardadorDeReferencias(); // objeto instanciado

        Conta cc = new ContaCorrente(22, 11); // adicionada conta 1
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(22, 22); // adicionada conta 2
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos(); // perguntei quantos elementos ele tem
        System.out.println(tamanho);

        Conta ref = (Conta) guardador.getReferencias(0); // qdo pede a referencia na posicao 1, devolve 1 OBJECT,
        // por isso precisa fazer CAST | transformando referencia GENERICA numa referencia mais ESPECIFICA
        System.out.println(ref.getNumero());

    }
}
