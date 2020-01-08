package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;	
	}

	@Override
	public String toString() {

		// comentaremos abaixo pois não queremos chamar um método da classe Object, e sim,
		// dar um significado maior para o método.
		// return super.toString();

		return "ContaPoupanca" + super.toString();
	}

}
