package estrela;

import java.util.ArrayList;

public class Constelacao {

	protected String nome;
	protected ArrayList<Estrela> estrelas;
	
	public Constelacao(String nome) {
		
		this.nome = nome;
		this.estrelas = new ArrayList<Estrela>();
	}
	
	public String getNome() {
		
		return this.nome;
	}
	
	public void adicionar(Estrela e) {
		
		if(e != null) {
			
			estrelas.add(e);
		}
	}
	
	public void infoEstrelas() {
		
		for(Estrela e: estrelas) {
			
			e.mostrar();
		}
	}
	
	public double tempConstelacao() {
		
		double soma = 0;
		
		for(Estrela e: estrelas/*int i = 0; i < estrelas.lenght; i++*/) {
			
			soma = (e.getTemperatura()) + soma;
		}
		
		return soma;
	}
}
