// modificadores, ordem do + restritivo para o -
// private, default, protected, public

// O modificador protected funciona igual ao *<<package private>>
// mas adiciona a visibilidade para os filhos (chamado de "publico para os filhos").

// A ausência do modificador, também chamado de package private ou default,
// o membro fica visível na classe e no package,
// mas é invisível fora do pacote (nem para filhos).

package br.com.bytebank.banco.modelo;


// sempre acima membros publicos
/**
 * Classe representa a moldura de uma conta
 *
 * @author fabiana.assami
 * @version 0.1
 *
 */

public abstract class Conta { // visivel em qquer lugar, dentro e fora do pacote

    protected double saldo; // é visivel dentro do pacote e publico para os filhos
    // <<package private>> só visivel dentro pacote OU DEFAULT (padrao)
    private int agencia; // visivel apenas dentro da classe
    private int numero;
    private Cliente titular;
    private static int total = 0;

    // em cima do construtor publico
    /**
     * Construtor para inicializar o objeto Conta a partir da agencia e numero
     * @param agencia
     * @param numero
     */
    
    public Conta(int agencia, int numero){
        Conta.total++;
        //System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;
        //System.out.println("Estou criando uma conta " + this.numero);
    }

    public abstract void deposita(double valor);

    // em cima do metodo
    /**
     *Valor precisa ser maior do que saldo
     *
     * @param valor
     * @throws SaldoInsuficienteException // esta é a excecao que o metodo joga
     */

    public void saca(double valor) throws SaldoInsuficienteException{
    	
        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        } 
        
        this.saldo -= valor;       
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }

    // reaproveitar codigo toString() para utilizar em ambas contas, corrente e poupanca.
    @Override
    public String toString() {
        return " Numero: " + this.numero + ", Agencia: " + this.agencia;
    }

}