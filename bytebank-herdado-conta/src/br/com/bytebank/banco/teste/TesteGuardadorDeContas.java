package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;
import org.omg.Messaging.*;
// import br.com.bytebank.banco.modelo.*;


// SINTAXE + FACIL, SEM USAR ARRAYS
public class TesteGuardadorDeContas {

    public static void main(String[] args) {
        // usar array diretamente
        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc = new ContaCorrente(22, 11);
        // utilizaremos o guardador para adicionarmos
        // uma conta, ou seja, para passarmos uma referência
        guardador.adiciona(cc); // chamar metodo() mas ele precisa ser criado no .modelo.GuardadorDeContas

        Conta cc2 = new ContaCorrente(22, 22);
        guardador.adiciona(cc2); // guardar a segunda conta na proxima posicaop livre, para isso precisamos de uma variavel auxiliar

        // criada impressao do resultado
        // criar o metodo para guarda-lo na Classe GuardadorDeContas
        // metodo adicionado mas precisamos implementar
        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencias(0);
        System.out.println(ref.getNumero());

    }
}
