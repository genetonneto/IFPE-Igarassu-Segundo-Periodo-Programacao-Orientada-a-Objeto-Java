/* Construa um algoritmo que faca a leitura de dois numeros inteiros e 
 * imprima no console qual numero e o maior, se é o primeiro ou o segundo.*/

package Ficha01;

import java.util.Scanner; 

public class Q4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int numero1, numero2;
		
		System.out.println("Digite o valor do primeiro numero");
		numero1 = (int) in.nextDouble();
		
		System.out.println("Digite o valor do segundo numero");
		numero2 = (int) in.nextDouble();
		
		if (numero1 > numero2) {
			System.out.println("O maior valor e " + numero1);
		} else {
			System.out.println(numero2);
		}

	}

}
