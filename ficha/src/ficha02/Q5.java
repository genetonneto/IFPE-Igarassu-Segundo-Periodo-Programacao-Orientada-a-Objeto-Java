/* Crie um algoritmo que preencha um Array com 100 numeros inteiros aleatoriamente e
 imprima os elementos numericos que sejam ımpares. */

package ficha02;

public class Q5 {

	public static void main(String[] args) {
		
		int meuArray [];
		meuArray = new int[100];
		
		int aleatorio;
		
		for (int contador = 0; contador <= meuArray.length; contador++) {
			aleatorio = (int) (Math.random()*100);
			
			if (contador % 2 == 1) {
				System.out.println(contador + " numeros impares");
			} 
		}
		
	}

}
