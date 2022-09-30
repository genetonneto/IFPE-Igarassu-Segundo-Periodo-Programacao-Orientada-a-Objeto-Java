package revisao;

public class Cliente {

	String nome;
	int nConta;
	float nAgencia;
	String cidade;
	String nomeBanco;

	Cliente(){
		
	}
	
	Cliente(String nome, int nConta, float nAgencia){
		this.nome = nome;
		this.nConta = nConta;
		this.nAgencia = nAgencia;
	}
	
	@Override
	public String toString(){
		return "Nome: " + nome + " Numero Conta: " + nConta + " Numero Agencia: " + nAgencia + " Cidade: " + cidade + " Nome Banco: " + nomeBanco;
	}

}
