/* 1. Escreva uma classe em Java com no mınimo 5 atributos de instancia e 2 metodos para 
 representar o estudante em um sistema de gestao academico. Considere criar 2 construtores 
em sobrecarga (um com parametros e outro sem), alem de definir o metodo toString para imprimir 
os dados do objeto. Defina um atributo de classe para contar a quantidade de instancias.
 */

package fichatres1;

public class Escola {

	public static void main(String[] args) {

		Aluno a1 = new Aluno();
		a1.nome = "Luana";
		a1.idade = 21;
		a1.bairro = "Caetes";
		a1.altura = 1.55f;
		a1.cpf = "12345678990";
		
		Aluno a2 = new Aluno("Arthur Lundgreen I", 1.82f);
		a2.nome = "Geneton";
		a2.idade = 23;
		a2.cpf = "12345678910";
		
		/*
		System.out.println("Nome:" + a1.nome + " Idade:" + a1.idade + " Bairro:" + a1.bairro + " Altura:" + a1.altura + " CPF:" + a1.cpf);
		System.out.println("Nome:" + a2.nome + " Idade:" + a2.idade + " Bairro:" + a2.bairro + " Altura:" + a2.altura + " CPF:" + a2.cpf);
		*/
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		
	}

}