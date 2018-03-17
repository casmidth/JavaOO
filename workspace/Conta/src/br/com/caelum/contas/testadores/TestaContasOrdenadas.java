package br.com.caelum.contas.testadores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaContasOrdenadas {

	public static void main(String[] args) {

		List<ContaCorrente> contas = new  ArrayList<>();
		ContaCorrente cc1 = new ContaCorrente();
		ContaCorrente cc2 = new ContaCorrente();
		ContaCorrente cc3 = new ContaCorrente();
		cc1.deposita(1000);
		cc2.deposita(5000);
		cc3.deposita(3000);
		
		contas.add(cc1);
		contas.add(cc2);
		contas.add(cc3);
		
		Collections.sort(contas);
		
		for(ContaCorrente cc : contas){
			System.out.println(cc.getSaldo());
		}
	}

}
