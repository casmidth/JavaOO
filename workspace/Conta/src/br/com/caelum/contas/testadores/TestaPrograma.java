package br.com.caelum.contas.testadores;

import br.com.caelum.contas.concorrente.Programa;

public class TestaPrograma {

	public static void main(String[] args) {

		Programa p1 = new Programa(1);
		Programa p2 = new Programa(2);
		Programa p3 = new Programa(3);

		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(p3);
		
		t1.start();
		t2.start();
		t3.start();
		//aqui existem 4 threads rodando, o metodo main e as 3 threads
	}

}
