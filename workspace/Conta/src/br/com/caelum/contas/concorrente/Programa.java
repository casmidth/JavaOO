package br.com.caelum.contas.concorrente;

public class Programa implements Runnable {

	private int id;
	public Programa(int id){
		this.id = id;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++){
			System.out.println("Processo " + i + " id " + id);
			//esse try catch aumenta o tempo de execucao mas executa as threads em ordem, 1, 2, 3, 1, 2, 3
			try{
				Thread.sleep(1);
				
			}catch (InterruptedException e) {
				e.printStackTrace();
				
			}
		}
	}

}
