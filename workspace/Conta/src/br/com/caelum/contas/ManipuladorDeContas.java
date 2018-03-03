package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {

	public Conta conta;
	
	public void criaConta(Evento evento){
		this.conta = new Conta();
		conta.setTitular("Batman");
		conta.setAgencia("0744");
		conta.setLimite(2000);
		conta.setDataDeAbertura("2018/03/03");
	}

	public void deposita(Evento evento){
		double valorDigitado = evento.getDouble("valor");
		this.conta.deposita(valorDigitado);
	}
	
	public void saca(Evento evento){
		double valorDigitado = evento.getDouble("valor");
			this.conta.saca(valorDigitado);
	}
	
	public static void main(String[] args) {

	}
	
	
}
