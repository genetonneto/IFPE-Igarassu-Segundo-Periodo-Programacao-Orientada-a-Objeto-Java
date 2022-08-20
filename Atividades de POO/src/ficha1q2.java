/* Crie um algoritmo em Java para realizar o cálculo de IMC. A saída 
do algoritmo deve ser o valor do IMC no console. */

import java.util.Scanner;

public class ficha1q2 {

	public static void main(String[] args) {
		
		// IMC = PESO / (ALTURA ** 2)

		Scanner in = new Scanner (System.in);
		
		//Declarando variaveis em uma unica linha;
		double peso, altura, imc;
		
		//Solicitando o primeiro valor (peso);
		System.out.println("Digite o peso");
		peso = in.nextDouble();
		
		//Solicitando o segundo valor (altura);
		System.out.println("Digite a altura");
		altura = in.nextDouble();
		
		//Aplicando a formula do IMC; 
		imc = peso / (altura * altura);
		System.out.println(imc);
	}

}
