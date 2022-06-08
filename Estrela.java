package estrela;

public class Estrela {
	
	protected String nome;
	protected double temperatura;
	protected String cor;
	
	public Estrela(String nome, double temperatura, String cor) {
		
		this.nome = nome;
		this.temperatura = temperatura;
		this.cor = cor;
	}
	
	public void mostrar() {
		
		System.out.println("Nome: " + this.nome);
		System.out.println("Temperatura: " + this.temperatura);
		System.out.println("Cor: " + this.cor + "\n");
		
	}
	
	public double getTemperatura() {
		
		return this.temperatura;
	}
	

}
