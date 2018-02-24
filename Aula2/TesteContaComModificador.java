public class TesteContaComModificador{
	public static void main(String[] args){
		Conta c1 = new Conta();
		c1.criarNovaConta();
		c1.setTitular("June Carter");
		c1.deposita(5000);
		c1.setLimite(1000);
		c1.setAgencia("3575");
		c1.setDataDeAbertura("24/02/2018");

		System.out.println(c1.recuperarDadosParaImpressao());	

		Conta contaComLimite = new Conta();
		System.out.println(contaComLimite.getLimite()); //deve retornar 1000, que esta criado no construtor

		Conta contaComTitular = new Conta("Johnny Cash");
		System.out.println(contaComTitular.getTitular());
		//System.out.println(contaComTitular.getLimite()); //deve retornar 0, pois nao tem referencia ao limite no construtor

		System.out.println(Conta.getQuantidadeDeContas());
		
		Conta c2 = new Conta();
		c2.criarNovaConta();
		c2.setTitular("Tonny Ramos");
		System.out.println(Conta.getQuantidadeDeContas());
		System.out.println(c2.getNumero());
	}	
}
