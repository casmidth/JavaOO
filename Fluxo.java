class Fluxo{
	public static void main(String[] args){
		boolean condicao = 32 > 45;		
		if(condicao){
			System.out.println("é maior");			
		}else{
			System.out.println("é menor");
		}

		int limite = 0;
		while(limite < 10){
			System.out.println("Rodando!");		
			limite ++;
		}

		/*for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				System.out.println("["+ i + ", " + j + "]");	
			}			
			//System.out.println("Rodando!" + i);		
		}*/
		
		//System.out.println(i); //i nesse caso esta fora do escopo "error: cannot find symbol"

		for(int i = 0; i < 10; i++){
			if(i%2 == 1) continue;
			
			System.out.println(i);		
			
			if(i>8) break;
		}

		
	}
}
