package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {

        // Autoboxing: transforma primitivos em objetos e vice versa (unboxing)
        // a classe Integer transforma o primitivo em objeto
        int[] idades = new int[5];
        String[] nomes = new String[5];

        int idade = 29; // é primitivo, sua classe é a Integer
//        Integer idadeRef = new Integer(29);
        Integer idadeRef = Integer.valueOf(29);  // autoboxing // metodo mais indicado para usar
        System.out.println(idadeRef.doubleValue());

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);

        int valor = idadeRef.intValue(); //unboxing
        // necessario adicionar args 12 nas configuracoes deste file == parsing
        String s = args[0];
//        Integer numero = Integer.valueOf(s);
        int numero = Integer.parseInt(s);
        System.out.println(numero);

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29); // AUTOBOXING

        // exemplo de autoboxing e unboxing por baixo dos panos
        // pois o codigo abaixo compila e retorna 4
        Integer ref = Integer.valueOf("3");
        ref++;
        System.out.println(ref);
    }
}
