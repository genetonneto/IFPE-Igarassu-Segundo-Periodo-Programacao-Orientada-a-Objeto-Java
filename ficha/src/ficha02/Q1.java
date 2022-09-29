/* Escreva um algoritmo em Java que solicite 5 notas e realize o calculo da media
aritmetica ao termino da execucao. */

// mediaAritimetica = (nota1 + nota2 + nota3 + nota4 + nota5) / totalDeNotas


package ficha02;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double nota1, nota2, nota3, nota4, nota5, mediaAritimetica;
		
		System.out.println("Digite a primeira nota");
		nota1 = in.nextDouble();
		
		System.out.println("Digite a segunda nota");
		nota2 = in.nextDouble();
		
		System.out.println("Digite a terceira nota");
		nota3 = in.nextDouble();
		
		System.out.println("Digite a quarta nota");
		nota4 = in.nextDouble();
		
		System.out.println("Digite a quinta nota");
		nota5 = in.nextDouble();
		
		mediaAritimetica = (nota1 + nota2 + nota3 + nota4 + nota5) / 5; 
		System.out.println("O resultado da Media Aritimetica e " + mediaAritimetica);

	}

}
