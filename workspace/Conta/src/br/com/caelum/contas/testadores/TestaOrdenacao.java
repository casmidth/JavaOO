package br.com.caelum.contas.testadores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaOrdenacao {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		numeros.add(10);
		numeros.add(50);
		numeros.add(30);
		numeros.add(8);
		
		System.out.println(numeros);
		//note que Colletion 'e a mae de todas as interfaces, collection eh um objeto
		Collections.sort(numeros);
		System.out.println(numeros);
		Collections.shuffle(numeros);
		System.out.println(numeros);
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
}
