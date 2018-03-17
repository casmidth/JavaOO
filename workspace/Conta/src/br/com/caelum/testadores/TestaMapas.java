package br.com.caelum.testadores;

import java.util.HashMap;
import java.util.Map;

public class TestaMapas {

	public static void main(String[] args){
		//Mapa 'e uma interface
		Map<String, String> dicionario = new HashMap<>();
		dicionario.put("bola", "ball");
		dicionario.put("mesa", "table");
		dicionario.put("lapis", "pencil");
		
		System.out.println(dicionario.get("mesa"));
	}
}
