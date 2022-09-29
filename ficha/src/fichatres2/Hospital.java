/* 
2. Escreva uma classe em Java com no mınimo 5 atributos de instancia e 2 metodos para representar o
paciente em um sistema de gestao hospitalar. Considere criar 2 construtores em sobrecarga (um com
parametros e outro sem), alem de definir o metodo toString para imprimir os dados do objeto. Defina
um atributo de classe para contar a quantidade de instancias.
*/

package fichatres2;

public class Hospital {

	public static void main(String[] args) {

		Paciente p1 = new Paciente();
		p1.nome = "Geneton";
		p1.sobrenome = "Neto";
		p1.idade = 23;
		p1.sexo = "Masculino";
		p1.altura = 1.82f;
		
		
		Paciente p2 = new Paciente("Hanna", 21);
		p2.sobrenome = "Luna";
		p2.sexo = "Feminino";
		p2.altura = 1.80f;
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}

}
