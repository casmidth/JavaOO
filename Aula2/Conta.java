public class Conta{
	private static int numero = 10;
	private static int quantidadeDeContas;
	private String titular;
	private String agencia;	
	private String dataDeAbertura;
	private double saldo;
	private double limite;

	public Conta(){
		limite = 1000;
	}
	
	public Conta(String titular){
		this.titular = titular;
		this.numero = criarNovaConta();			
	}

	public int getNumero(){ return numero; }
	/*public void setNumero(int numero){
		this.numero = numero;
		
	}*/
	
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

	public static int criarNovaConta(){
		quantidadeDeContas++;
		return numero++;
		
	}
	
	boolean saca(double valor){
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
	
	void deposita(double valor){
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

	double calculaRendimento(){
		return saldo * 0.1;

	}

	String recuperarDadosParaImpressao(){
		//System.out.println("\n--------Informarcao da Conta--------");
		//System.out.println("Titular:" + titular);
		//System.out.println("Agencia:" + agencia);	
		//System.out.println("Conta:" + numero);
		//System.out.println("Dada de abertura:" + dataDeAbertura);		
		//System.out.println("LIS:" + limite);
		//System.out.println("Saldo até hoje:" + saldo);
		//System.out.println("Rendimento até hoje:" + calculaRendimento());
		//System.out.println("--------------------------------------\n");
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
