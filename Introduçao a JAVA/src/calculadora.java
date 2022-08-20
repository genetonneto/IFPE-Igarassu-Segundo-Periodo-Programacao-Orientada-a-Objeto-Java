/* Crie um algoritmo em Java para realizar o calculo de IMC. 
 *  A saída do algoritmo deve ser o valor do IMC no console */

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		//DECLARANDO O NOME DAS VARIAVEIS EM UMA UNICA LINHA
		double num1, num2, soma, subtraçao, multiplicaçao,  divisao, modulo; 
		
		//DANDO A ENTRADA DO PRIMEIRO NUMERO
		System.out.println("Digite o primeiro numero");
		num1 = in.nextDouble();
		
		//DANDO A ENTRADA DO SEGUNDO NUMERO
		System.out.println("Digite o segundo numero");
		num2 = in.nextDouble();
		
		// ESCOLHA QUAL OPERAÇAO QUER REALIZAR E RETIRE DO COMENTARIO PARA QUE ELA FUNCIONE
		
		// SOMA DOS NUMEROS
		//soma = num1 + num2; 
		//System.out.println(soma);
		
		//SUBTRAÇAO DOS NUMEROS
		//subtraçao = num1 - num2;
		//System.out.println(subtraçao);
		
		//MULTIPLICAÇAO DOS NUMEROS
		//multiplicaçao = num1 * num2;
		//System.out.println(multiplicaçao);
		
		//DIVISAO DOS NUMEROS INTEIROS
		//divisao = num1 / num2;
		//System.out.println(divisao);
		
		//MODULO DOS NUMEROS(DA O RESTO DA DIVISAO DE UM NUMERO)
		//NO CASO: 5 DIVIDIDO PARA 2 É IGUAL = 1
		//PQ: 2 + 2 = 4 ENTÃO SOBRA 1 PARA COMPLETAR O VALOR DE 5
		//modulo = num1 % num2;
		//System.out.println(modulo);
	}

}

