/* Crie um algoritmo que preencha um Array com 100 numeros inteiros aleatoriamente e imprima os
elementos. Alem disso, deve-se realizar a impressao inversa tambem. */

import java.util.Scanner;

public class ficha2q3 {

	public static void main(String[] args) {

		int meuArray [];
		meuArray = new int [100];
		
		int aleatorio; 
		
		
		for (int contador = meuArray.length - 1; contador >= 0 ; contador--){
			//aleatorio = (int) (Math.random()*100);
			System.out.println(contador);
		}
	}

}
