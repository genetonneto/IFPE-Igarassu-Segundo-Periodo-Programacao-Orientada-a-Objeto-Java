package banco;

public class Conta {

	public static void main(String[] args) {

		Cliente c = new Cliente();
		c.nome = "Geneton";
		c.cpf = 12345678.9f;
		c.agencia = 6066;
		c.conta = 454.236f;
		c.saldo = false;
		c.status();
		c.chequeEspecial();
	}

}
