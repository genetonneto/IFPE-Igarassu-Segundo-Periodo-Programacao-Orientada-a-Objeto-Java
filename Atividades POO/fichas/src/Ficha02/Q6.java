/* 6. Crie um algoritmo que preencha um Array com 100 numeros inteiros aleatoriamente 
e imprima os elementos numericos que sejam pares. */ 

package Ficha02;

public class Q6 {

	public static void main(String[] args) {
		
		int meuArray[];
		meuArray = new int[100];
		
		int aleatorio;
		
		for (int contador = 1; contador <= meuArray.length; contador++){
			aleatorio = (int)(Math.random()*100);
			
			if (contador % 2 == 0) {
				System.out.println(contador + " numero par");
			}
			
		}
		

	}

}
