class Variaveis{
	public static void main(String[] args){
		int idade = 25;
		int idadeNoAnoQueVem = idade + 1;
		System.out.println("idade: " + idade);
		
		double preco = 10.3; //virus do super homem
		preco = 10 / 4 ; //resultado = 2.0 (autoboxing -> usando a divisao de dois numeros inteiros e colocando dentro de uma variavel double, da o resultado + .0)
		preco = 10 / 4.0;
		//preco = 10 / 0; //arithmetic exception
		System.out.println("valor: " + preco + " reais");
		
		char letra = 'c';
		System.out.println("letra: " + letra);

		boolean verdade = true;
		verdade = !verdade;
		System.out.println("estado: " + verdade);
	}
}
