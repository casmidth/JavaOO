class Ex3134{
	public static void main(String[] args){
		int fatorial = 1;		
		
		for(int n = 1; n < 10; n++){
			fatorial = (n - 1) * n;			
			int resultado = fatorial * n;
			System.out.println(resultado);		
		}		
	}
}
