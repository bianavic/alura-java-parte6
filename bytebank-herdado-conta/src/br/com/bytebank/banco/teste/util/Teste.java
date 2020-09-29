package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {

        // Autoboxing: transforma primitivos em objetos e vice versa
        // a classe Integer transforma o primitivo em objeto
        int[] idades = new int[5];
        String[] nomes = new String[5];

        int idade = 29; // é primitivo, sua classe é a Integer
        Integer idadeRef = new Integer(29);
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29); // AUTOBOXING

    }
}
