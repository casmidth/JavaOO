package br.com.caelum.contas;

import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.Tributavel;

public class TestaTributavel {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();
		cc.deposita(200);
		System.out.println(cc.getValorImposto());
		//cc tem tudo de conta (classe pai) e tributavel (interface)
		
		Tributavel t = cc;
		System.out.println(t.getValorImposto());
		//t tem tudo que tem um tributavel
		
		
	}

}
