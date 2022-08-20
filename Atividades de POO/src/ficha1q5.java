// Elabore um algoritmo em Java para identificar se um numero ́e par ou ımpar.

import java.util.Scanner;

public class ficha1q5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Digite o primeiro valor");
		numero = in.nextDouble();
		
		
		if (numero % 2 == 0) {
			System.out.println(numero + " e um numero e par");
		} else {
			System.out.println(numero + "e um numero impar");
		}
		
	}

}
