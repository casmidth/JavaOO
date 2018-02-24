class TestaTransferencia{
	public static void main(String[] args){
		Conta contaOrigem = new Conta();
		contaOrigem.deposita(10000.0);
		contaOrigem.numero = 70;
		contaOrigem.titular = "Anitta";
		
		Conta contaDestino = new Conta();
		contaDestino.deposita(30000.0);
		contaDestino.numero = 100;
		contaDestino.titular = "Pablo Vittar"; 	

		System.out.println(contaOrigem.recuperarDadosParaImpressao());
		System.out.println(contaDestino.recuperarDadosParaImpressao());

		//transferencia sucesso
		contaOrigem.transferePara(contaDestino, 500);
		contaOrigem.recuperarDadosParaImpressao();
		contaDestino.recuperarDadosParaImpressao();

		//transferencia invalida
		contaOrigem.transferePara(contaDestino, contaOrigem.saldo + 10);
		
		System.out.println(contaOrigem.recuperarDadosParaImpressao());
		System.out.println(contaDestino.recuperarDadosParaImpressao());

	}
}
