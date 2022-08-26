/* Crie um algoritmo que preencha um Array com 100 numeros inteiros aleatoriamente e imprima os
elementos. Alem disso, deve-se realizar a impressao inversa tambem. */


package Ficha02;

public class Q3 {

	public static void main(String[] args) {

		int array [];
		array = new int [100];
		
		int aleatorio;
		
		
		for(int contador1 = 1; contador1 <= array.length; contador1++) {
			aleatorio = (int)(Math.random()*100);
			array[contador1] = aleatorio;
			//System.out.println(aleatorio);
			
			
			for(int contador2 = array[contador1] - 1; contador2 >= 0; contador2--) {
				System.out.println(contador2);
			}
		}
		
		
	}

}
// PROFESSOR, NÃO SEI SE ESTA CORRETO, TIVE DIFICULDADE DE APLICAR SOBRE A FORMULA DE NUMEROS ALEATORIOS
