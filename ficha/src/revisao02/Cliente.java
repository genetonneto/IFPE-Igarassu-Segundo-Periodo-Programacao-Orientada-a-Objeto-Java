package revisao02;

public class Cliente {

	public String nome;
	protected float saldo;
	protected int nConta;
	protected float nAgencia;
	public String banco;
	
	Cliente(){
		
	}
	
	Cliente(String nome, float saldo){
		this.nome = nome;
		this.saldo = saldo;
	}
	
	Cliente(int nConta, float nAgencia){
		this.nConta = nConta;
		this.nAgencia = nAgencia;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + " Saldo: " + saldo + " Nº Conta: " + nConta + " Nº Agencia: " + nAgencia + " Banco: " + banco;
	}
	
	@Override
	public boolean equals(Object obj) {
		Cliente c = (Cliente) obj;
		return this.saldo == c.saldo;
	}
}
