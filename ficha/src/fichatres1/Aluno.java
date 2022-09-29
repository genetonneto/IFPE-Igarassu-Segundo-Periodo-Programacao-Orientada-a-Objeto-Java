package fichatres1;

public class Aluno {

	String nome;
	int idade;
	String bairro;
	float altura;
	String cpf;
	


	Aluno() {
		
	}
	
	Aluno(String bairro, float altura) {
		this.bairro = bairro;
		this.altura = altura;
	}
	
	//METODO toString - ELE SOBREPÕE UM OBJETO
	@Override
	public String toString() {
		return "Nome: " + nome + " Idade: " + idade + " Bairro: " + bairro + " Altura: " + altura + " CPF: " + cpf;
	}
	
}
