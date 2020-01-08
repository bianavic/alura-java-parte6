package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.especial.*;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;
import java.lang.*; // é o unico pacote q nao precisa ser
// importado pelo java.
// atravews dele utilizamos as classes 'String' e 'System', 'Exception',
// 'RuntimeException', 'NullPointerException', 'ArithmeticException'

public class TesteContas {

	// java.lang.String (FQN = full qualified name)
	public static void main(String[] args) throws SaldoInsuficienteException{

		ContaCorrente outra = null;
		outra.deposita(200.0); 
					
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());


	}

}
