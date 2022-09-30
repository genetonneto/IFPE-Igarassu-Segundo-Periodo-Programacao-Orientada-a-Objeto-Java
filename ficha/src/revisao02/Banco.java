package revisao02;

public class Banco {

	public static void main(String[] args) {

		Cliente c1 = new Cliente();
		c1.nome = "Beatriz";
		c1.saldo = 1500.00f;
		c1.nConta = 6066;
		c1.nAgencia = 12345.6f;
		c1.banco = "Itau";
		
		/*
		Cliente c2 = new Cliente("Ana", 0f);
		c2.nConta = 1234;
		c2.nAgencia = 98765.4f;
		c2.banco = "Bradesco";
		
		Cliente c3 = new Cliente(7363, 32459.3f);
		c3.nome = "Maria";
		c3.saldo = 800.80f;
		c3.banco = "NuBank";
		*/
		
		Cliente c4 = c1;
		
		Cliente c5 = new Cliente ("Zordon");
		c1.saldo = 1500.00f;
		c1.nConta = 6066;
		c1.nAgencia = 12345.6f;
		c1.banco = "Itau";
		
		//System.out.println(c1.toString());
		//System.out.println(c2.toString());
		//System.out.println(c3.toString());
		
		//METODO EQUALS
		System.out.println(c1.equals(c5));
		//System.out.println(c2.equals(c2));
		//System.out.println(c3.equals(c3));
	}

}
