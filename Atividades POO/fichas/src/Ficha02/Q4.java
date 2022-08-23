/* Crie um algoritmo que preencha um Array com 100 numeros inteiros aleatoriamente e imprima os
elementos numericos que sejam primos. */

package Ficha02;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		int meuArray [];
		meuArray = new int[100];
		
		int aleatorio;
		
		for (int contador = 0; contador <= meuArray.length; contador++) {
			aleatorio = (int)(Math.random()*100);
			System.out.println(aleatorio);
		}
		
	}

}
