package br.com.caelum.contas.modelo;

/**
 * 
 * @author oo7297
 * 
 */
public abstract class Conta{
	private static int quantidadeDeContas = 0;
	private int numero;
	private String titular;
	private String agencia;	
	private String dataDeAbertura;
	protected double saldo;
	private double limite;

	public Conta(){
		addNovaConta();	
	}
	
	public Conta(String titular, int numero, String agencia){
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
		addNovaConta();			
	}

	public abstract String getTipo();
	
	public int getNumero(){ return numero; }
	public void setNumero(int numero){
		this.numero = numero;
	}
	
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
		return quantidadeDeContas;	
	}

	public static int addNovaConta(){
		return quantidadeDeContas++;
	}
	 
	/**
	 * 
	 * @param valor Valor a ser sacado da conta
	 * @return true se sacou
	 * <h1>Pode colocar html dentro do java doc!</h1>
	 */
	public synchronized boolean saca(double valor){ //synchronized significa que esse metodo 'e atomico, ele nao permite que haja troca de threads no meio da execucao desse metodo
		//o tomcat por exemplo tem esse tratamento de concorrencia nas suas applicacoes para web
		//lembrando que solucoes 100% atomicas sao extremamente lentas, vide sistemas bancarios
		if(valor > 0 ){
			if(valor <= saldo + limite){ 
				saldo = saldo - valor;
				System.out.println("Saque de " +  valor + " feito com sucesso!");
				return true;
			}	else {
				throw new SaldoInsuficienteException(valor);
			}
		}
		else{
			throw new IllegalArgumentException("Voce tentou sacar um valor negativo");
		}
	}
	
	public synchronized void deposita(double valor){
		if(valor < 0){
			throw new IllegalArgumentException("Voce tentou depositar um valor negativo");
		}
		else{
			saldo += valor;
		}	
		
	}

	public void transfere(double valor, Conta conta){
		System.out.println("Iniciando transferencia de " + valor);
		if(saca(valor)){
			conta.deposita(valor);
			System.out.println("Transferencia de " +  valor + " para " + conta.titular + " feita com sucesso!");
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