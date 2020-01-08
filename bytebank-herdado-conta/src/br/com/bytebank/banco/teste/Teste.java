package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class Teste {

    public static void main(String[] args) {

//        // varias versoes do mesmo metodo
//        System.out.println("x");
//        System.out.println(3);
//        System.out.println(false);

        // o objeto define qual metodo sera chamado
        // polimorfismo = referencia generica
        Object cc = new ContaCorrente(22, 33);
        Object cp = new ContaPoupanca(33, 22);
        Object cliente = new Cliente();

        // reutilizacao de codigo
        System.out.println(cc); // herdamos o metodo que vem da classe object
        System.out.println(cp);

        // println(cliente);
    }

    // SOBRECARGA =  vários métodos com o mesmo nome e assinatura, apenas variando os parâmetros.
    static void println() {}
    static void println(int a) {}
    static void println(boolean valor) {}

    static void println(Object referencia) {} // polimorfismo

}
