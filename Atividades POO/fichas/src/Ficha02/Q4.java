package Ficha02;

import java.util.Scanner;

public class Q4 {

	   public static void main (String[] args) {

	        /**Crie um algoritmo que preencha um Array com 100 números inteiros aleatoriamente e imprima os elementos numéricos que sejam primos. */

	        int aleatorio;
	        int divisores = 0;

	        int [] arrayNumbs = new int [100];
	        for(int i = 0; i < arrayNumbs.length ; i++) {
	          aleatorio = (int) (Math.random()*100);  
	          arrayNumbs[i] = aleatorio;

	            for(int j = 1; j <= arrayNumbs[i] && divisores <= 2; j++) {
	                if(arrayNumbs[i] % j == 0) {
	                    divisores++;
	                }

	            } 
	            if(divisores == 2) {
	                    System.out.println(arrayNumbs[i]);
	                }

	                divisores = 0;        
	            }
	    
	    }
	}