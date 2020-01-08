package br.com.bytebank.banco.teste;

public class TesteString {
    public static void main(String[] args) {

        // SOBRECARGA = quando um metodo possui 2 parametros

//        String vazio = ""; // esta vazio
//        String naoVazio = " "; // nao esta vazio
//
//        System.out.println(vazio.isEmpty());
//        System.out.println(naoVazio.isEmpty());

        String vazio = "    Alura";
        String outroVazio = vazio.trim();

        System.out.println(vazio.contains("Alura"));
        System.out.println(outroVazio);


//        String nome = "Alura";
//        System.out.println(nome.length());
//
//        for(int i = 0; i < nome.length(); i++) {
//            System.out.println(nome.charAt(i));
//        }

//        String sub = nome.substring(1);
//        System.out.println(sub);

//        char c = nome.charAt(0);
//        System.out.println(c);

//        int pos = nome.indexOf("ur");
//        System.out.println(pos);

//        char c = 'A'; // aspas simples == um caractere
//        char d = 'a';
//
//        String outra = nome.replace(c, d);

        // String outra = nome.replace("Al", "aL");

        //String outra = nome.toLowerCase();

        // nome.toLowerCase();trings na memoria
//        System.out.println(nome);
//        System.out.println(outra);


    }
}
