class TestaConta{
	public static void main(String[] args){
		Conta conta = new Conta();
		conta.numero = 224;
		conta.titular = "Elza Soares";
		conta.limite = 5000.0;
		conta.dataDeAbertura = "04/05/2015";
		System.out.println(conta.recuperarDadosParaImpressao());

		//conta.recuperarDadosParaImpressao();
		conta.deposita(20000.0);
		//conta.recuperarDadosParaImpressao();

		//conta.saca(10000.0);		
		boolean sacou = conta.saca(-10000.0);
		if(sacou){
			System.out.println("Saque feito");	
		}			
		else{
			System.out.println("Erro ao sacar");		
		}
		//conta.recuperarDadosParaImpressao();
		
		System.out.println("Rendimento da conta: " + conta.calculaRendimento());

		System.out.println(conta.recuperarDadosParaImpressao());

	}
}
