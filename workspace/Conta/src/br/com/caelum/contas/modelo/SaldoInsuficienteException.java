package br.com.caelum.contas.modelo;

public class SaldoInsuficienteException extends RuntimeException {

	public SaldoInsuficienteException(double valor){
		super("Saque de " + valor + " maior que saldo disponivel em conta!");
	}
	
}
