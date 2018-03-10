package br.com.caelum.contas;

import br.com.caelum.contas.modelo.SeguroDeVida;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeSeguroDeVida {
	
	private SeguroDeVida sdv;
	
	public void criaSeguro(Evento e){
		this.sdv = new SeguroDeVida();
		this.sdv.setNumeroApolice(e.getInt("numeroApolice"));
		this.sdv.setTitular(e.getString("titular"));
		this.sdv.setValor(e.getDouble("valor"));
		this.sdv.setTipo("Seguro de Vida");
	}

}
