package revisao;

public class Banco {

	public static void main(String[] args) {

		Cliente c1 = new Cliente();
		c1.nome = "Afranio";
		c1.nConta = 6044;
		c1.nAgencia = 34567.1f;
		c1.cidade = "Paulista";
		c1.nomeBanco = "Itau";
		
		Cliente c2 = new Cliente("Etevaldo", 9876, 76543.2f);
		c2.cidade = "Abreu e Lima";
		c2.nomeBanco = "Caixa";
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
