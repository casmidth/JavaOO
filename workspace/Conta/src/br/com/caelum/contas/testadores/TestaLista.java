package br.com.caelum.contas.testadores;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaLista {
	
	public static void main(String[] args){
		List lista = new ArrayList();
		lista.add("Paulo");
		lista.add("Guilherme");
		lista.add(38);
		lista.add("Sergio");
		System.out.println(lista);

		System.out.println(lista.contains("Paulo"));
		lista.remove("Sergio");
		System.out.println(lista);
		System.out.println(lista.size());

		
		List<String> listaDeNomes = new LinkedList<>();
		listaDeNomes.add("Paulo");
		listaDeNomes.add("Guilherme");
		//lista.add(38); //manter essa linha quebra o codigo, pois agora ele so aceita Strings devido ao Generics adicionado
		listaDeNomes.add("Sergio");
		System.out.println(lista);
		
		
		Set<String> linguagem = new HashSet<>(); //set nao guarda a ordem de insercao e nao tem duplicatas!
		linguagem.add("Java");
		linguagem.add("Cobol");
		linguagem.add("C");
		linguagem.add("Java");
		System.out.println(linguagem);
		
//		Iterator<String> i = linguagem.iterator();
//		while(i.hasNext()){
//			System.out.println(i.next());
//			if(i.equals("Cobol")){
//				i.remove();
//			}
//			
//		}
//		System.out.println(linguagem);
		
		
//		List<Conta> contas = new ArrayList<>(); //meio confuso e trabalhoso
//		contas.add(new ContaCorrente());
//		contas.get(0).setTitular("Lili");
//		contas.get(0).deposita(10); //aqui ele vai cobrar 10% de imposto pq o Java le as filhas antes do pai. Entao, a filha cc tem uma implementacao para deposita que cobra 10%.
////		ContaCorrente c = contas.get(0); //uma Conta nao 'e uma conta correte!!!
		
				
	}
}