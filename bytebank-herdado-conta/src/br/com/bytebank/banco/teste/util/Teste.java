package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.*;

import java.util.*;

public class Teste {

    public static void main(String[] args) {

        // ESTRUTURA DE DADDOS = classe mais sofisticada
        ArrayList lista = new ArrayList(); // Novo objeto criado (new) com o construtor ArrayList()
        // criamos nosso guardador de referências, o ArrayList()

        Conta cc = new ContaCorrente(22, 11); // adicionada conta 1
        lista.add(cc); // o metodo ADICIONA altera para ADD

        Conta cc2 = new ContaCorrente(22, 22); // adicionada conta 2
        lista.add(cc2);

        System.out.println("Tamanho: " + lista.size());

        System.out.println(lista.size());

        // Object ref = lista.get(0); // OBJECT = array de referencias
        Conta ref = (Conta) lista.get(0); // quero receber o elemento da posicao zero, ele retorna um OBJECT.
        // sabemos que o primeiro elemento é uma conta, podemos substituir OBJECT por CONTA
        // transformando uma referencia mais generica numa mais especifica

        System.out.println(ref.getNumero());

        // posso remover
        lista.remove(0);
        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(33, 331); // adicionada conta 1
        lista.add(cc3); // o metodo ADICIONA altera para ADD

        Conta cc4 = new ContaCorrente(33, 332); // adicionada conta 2
        lista.add(cc4);

        System.out.println("Tamanho: " + lista.size());

        // iteracao para acessar cada um dos elementos

        // codigo legado
        // forma + simples para iterar
        // laco para cada elemento do tipo object ele nos retornará uma referência do tipo Object
        for (int i = 0; i < lista.size(); i++) {
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("--------------------------------------");

        // forma + simples para iterar
        // laco para cada elemento do tipo object ele nos retornará uma referência do tipo Object
        // para cada elemento do tipo object desta variavel oRef, retorna lista
        for(Object oRef : lista) {
            System.out.println(oRef);
        }

    }

}
