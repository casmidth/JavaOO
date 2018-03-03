package br.com.caelum.contas.modelo;

public class Gerente extends Funcionario {
	
	public double getBonificacao(){
		return super.getBonificacao() + 1000;
	}
}
