class Ex3134{
	public static void main(String[] args){
		int fatorial = 1;		
		
		for(int n = 1; n < 10; n++){
<<<<<<< HEAD
			fatorial *= n;			
			System.out.println(n + "! = " + fatorial);		
=======
			fatorial = (n - 1) * n;			
			int resultado = fatorial * n;
			System.out.println(resultado);		
>>>>>>> a660b782851d0d4b0f15a42d1d2fd87649b8da8d
		}		
	}
}

