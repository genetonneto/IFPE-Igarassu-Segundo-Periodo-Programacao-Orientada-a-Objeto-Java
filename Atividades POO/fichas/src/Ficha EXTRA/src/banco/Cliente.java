package banco;

public class Cliente {

	public String nome;
	public float cpf;
	public int agencia; 
	public float conta;
	protected boolean saldo;
	
	public void status() {
		System.out.println("Cliente com o nome " + this.nome + ",tem o cpf de numero " + this.cpf + ",sua agencia e " + this.agencia + ",e o numero da sua conta e " + this.conta);
		//System.out.println("Seu saldo esta negativo ?" this.saldo);
	}
	
	public void chequeEspecial() {
		if (this.saldo == true) {
			System.out.println("O cliente esta limpo");
		} else {
			System.out.println("O cliente esta negativado");
		}
	}

}
