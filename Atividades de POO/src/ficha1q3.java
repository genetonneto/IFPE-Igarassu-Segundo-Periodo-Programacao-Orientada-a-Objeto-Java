/* Escreva um algoritmo em Java para realizar o calculo de  ́area de um trapezio
retângulo. Todas as entradas do usuário devem estar em cm. A saıda do algoritmo
deve ser a  ́area do trap ́ezio em cm2 no console; 
(e.g. ”A  ́area do trapezio em cm2  ́e ”).
 */

// AREA = (BASEMAIOR + BASEMENOR) * ALTURA / 2

import java.util.Scanner;

public class ficha1q3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		double area, baseMaior, baseMenor, altura; 
		
		System.out.println("Digite o valor da Base Maior");
		baseMaior = in.nextDouble();
		
		System.out.println("Digito o valor da Base Menor");
		baseMenor = in.nextDouble();
		
		System.out.println("Digite o valor da Altura");
		altura = in.nextDouble();
		
		area = (baseMaior + baseMenor) * altura / 2;
		System.out.println(area);
		
		
	}

}
