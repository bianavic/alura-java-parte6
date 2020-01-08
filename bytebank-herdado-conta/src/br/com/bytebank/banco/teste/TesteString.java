package br.com.bytebank.banco.teste;

public class TesteString {
    public static void main(String[] args) {

        String vazio = "    Alura";
        String outroVazio = vazio.trim();

        System.out.println(vazio.contains("Alura"));
        System.out.println(outroVazio);

    }
}

