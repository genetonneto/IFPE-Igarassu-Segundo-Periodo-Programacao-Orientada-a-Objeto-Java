package fichatres2;

public class Paciente {
	
	String nome;
	String sobrenome;
	int idade;
	String sexo;
	float altura;
	
	Paciente(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	Paciente(){
		
	}
	
	@Override
	public String toString(){
		return "Nome: " + nome + " Sobrenome: " + sobrenome + " Idade: " + idade + " Sexo: " + sexo + " Altura: " + altura;
	}
	
}
