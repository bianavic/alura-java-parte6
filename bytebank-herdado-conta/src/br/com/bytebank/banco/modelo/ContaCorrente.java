package br.com.bytebank.banco.modelo;

//new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
        super.saldo += valor;
    }

	@Override
	public double getValorImposto() {	
		return super.saldo * 0.01;
	}

	@Override
	public String toString() { // metodo toString() existe para ser sobreescrito e deve
		// devolver informacoes sobre o estado do objeto

		// comentaremos abaixo pois não queremos chamar um método da classe Object, e sim,
		// dar um significado maior para o método.
		// return super.toString();

		return "ContaCorrente" + super.toString();
	}
}
