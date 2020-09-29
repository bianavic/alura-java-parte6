package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.List;

public class TesteLinkedList {

    public static void main(String[] args) {

        // as 3 opçoes abaixo funcionam
//        LinkedList<Conta> lista = new LinkedList<Conta>();
//        List<Conta> lista = new LinkedList<Conta>();
        List<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        System.out.println("Tamanho: " + lista.size());
        Conta ref = (Conta) lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);

        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(33, 331);
        lista.add(cc3);
        Conta cc4 = new ContaCorrente(33, 332);
        lista.add(cc4);

        for (int i = 0; i < lista.size(); i++) {
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("--------------------------------------");

        for (Conta conta : lista) {
            System.out.println(conta);
        }

    }
}
