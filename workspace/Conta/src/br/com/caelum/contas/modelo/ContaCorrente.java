package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	
	public boolean saca(double valor){
		return super.saca(valor + 0.10);                                                                                                                                                                                                                                                                                                                                              
		
	}

	@Override
	public String getTipo() {
		return "Conta Corrente";
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01; //usar super ou this?
	}
	
}
