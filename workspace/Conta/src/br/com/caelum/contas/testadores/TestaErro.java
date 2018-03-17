package br.com.caelum.contas.testadores;

import java.io.FileNotFoundException;

import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaErro {

	public static void main(String[] args) {
		System.out.println("---Inicio do main---");
		metodo1();
		System.out.println("---Fim do main---");
	}

	public static void metodo1(){ //lembrando que so se chama metodo estatico quando esta em um metodo estatico
		System.out.println("---Inicio do metodo 1---");
		metodo2();
		System.out.println("---Fim do metodo 1---");
	}
	
	public static void metodo2(){
		System.out.println("---Inicio do metodo 2---");
		int[] array = new int[10];
		try{
			for(int i = 0; i < 15; i++){                     																																																																																																																																																																																																																																																																																																																																																																																																	
				array[i] = i * i;
				System.out.println(array[i]);
			}	
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		System.out.println("---Fim do metodo 2---");
	}
}
