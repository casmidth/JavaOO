package br.com.caelum.contas.testadores;

import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {
		System.out.println("Iniciando...");
		Collection<Integer> teste = new HashSet<>();
		long inicio = System.currentTimeMillis();
		
		int total = 300000; //cada vez que roda toma um tempo diferente. usando uma array ;e mto mais devagar 
		
		for(int i = 0; i < total ; i++){
			teste.add(i);
		}
		
		for(int i = 0; i < total; i++){
			teste.contains(i);
		}
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
	}

}