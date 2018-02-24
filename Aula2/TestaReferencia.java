class TestaReferencia{
	public static void main(String[] args){
		Conta c1 = new Conta();
		c1.numero= 10; //voltar para numero
		c1.titular = "Jay Z";
		
		Conta c2 = new Conta();
		c2.numero = 10;
		c2.titular = "Beyonce";
		
		System.out.println(c1 == c2); /*resultado é falso. Objetos devem ser testados com a referencia. Apesar dos objetos serem iniciados igualmente, eles são duas referencias diferentes.*/

		System.out.println(c1.numero == c2.numero); /*resultado é verdadeiro. Aqui a comparacao é entre o valor do tipo primitivo do objeto */

		c1 = c2; /*aqui, a referencia para c1 "some" e c1 usa a referencia de c2.*/
		c2.numero = 20;
		System.out.println(c1.numero); /*c1 recebeu os valores de c2, e quando configuramos c2 para 20, a refencia de c1 é igual a de c2*/
		
	
		System.out.println(c1.recuperarDadosParaImpressao());
		
		
	}
}
