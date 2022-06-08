package estrela;

public class MainConstelacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Estrela est1 = new Estrela("Estrela 1", 1000.05, "Roxa");
		//est1.mostrar();
		
		Estrela est2 = new Estrela("Estrela 2", 2000, "Rosa");
		//est2.mostrar();
		
		Estrela est3 = new Estrela("Estrela 3", 3000.20, "Azul");
		//est3.mostrar();
		
		Constelacao c = new Constelacao("Constelação X");
		
		c.adicionar(est1);
		c.adicionar(est2);
		c.adicionar(est3);
		
		c.infoEstrelas();
		
		System.out.println("Temperatura da contelação: " + c.tempConstelacao());

	}

}
