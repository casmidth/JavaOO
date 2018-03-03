package br.com.caelum.contas.modelo;

/**
 * 
 * @author oo7297
 * 
 */
public class Conta{
	private static int numero = 1;
	private String titular;
	private String agencia;	
	private String dataDeAbertura;
	private double saldo;
	private double limite;

	public Conta(){
		//limite = 1000;
		Conta.numero = criarNovaConta();
	}
	
//	public Conta(String titular){
//		this.titular = titular;
//		Conta.numero = criarNovaConta();			
//	}

	public int getNumero(){ return numero; }
	
	public String getTitular() { return titular;}
	public void setTitular(String titular) { this.titular = titular;}

	public String getAgencia() { return agencia;}
	public void setAgencia(String agencia){ this.agencia = agencia;}

	public String getDataDeAbertura() {return dataDeAbertura;}
	public void setDataDeAbertura(String dataDeAbertura) { this.dataDeAbertura = dataDeAbertura;}

	public double getSaldo() { return saldo;}

	public double getLimite() {return limite;}
	public void setLimite(double limite) { this.limite = limite;}
	
	
	public static int getQuantidadeDeContas(){
		return numero;	
	}

	public static int criarNovaConta(){
		return numero++;
	}
	 
	/**
	 * 
	 * @param valor Valor a ser sacado da conta
	 * @return true se sacou
	 * <h1>Pode colocar html dentro do java doc!</h1>
	 */
	public boolean saca(double valor){
		if(valor > 0 ){
			if(valor <= saldo + limite){ 
				saldo = saldo - valor;
				System.out.println("Saque de " +  valor + " feito com sucesso!");
				return true;
			}
			else{
				System.out.println("Valor de saque maior que limite em conta.\n LIS: " + saldo + limite);			
			}		
		}
		else{
			System.out.println("Valor de saque invalido");
		}
		return false;
	}
	
	public void deposita(double valor){
		saldo += valor;
		System.out.println("Deposito de " +  valor + " feito com sucesso!");
	}

	void transferePara(Conta destino, double valor){
		System.out.println("Iniciando transferencia de " + valor);
		if(saca(valor)){
			destino.deposita(valor);
			System.out.println("Transferencia de " +  valor + " para " + destino.titular + " feita com sucesso!");
		}
		else{
			System.out.println("Transferencia cancelada");		
		}
	}

	public double calculaRendimento(){
		return saldo * 0.1;

	}

	public String recuperarDadosParaImpressao(){
		String dados = "\n--------Informarcao da Conta--------\n" +
			"Titular:" + titular + "\n" +
			"Agencia:" + agencia + "\n" +
			"Conta:" + numero + "\n" +
			"Dada de abertura:" + dataDeAbertura + "\n" +
			"LIS:" + limite + "\n" +
			"Saldo até hoje:" + saldo + "\n" +
			"Rendimento até hoje:" + calculaRendimento() + "\n" +
			"--------------------------------------\n";
		return dados;
	
	}
}