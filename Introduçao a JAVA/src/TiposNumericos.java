
public class TiposNumericos {

	public static void main(String[] args) {
		
		// VARIAVEIS NUMERICAS PARA TIPO INTEIRO
		
		// O byte dos tipos numericos é o mais primitivo/mais baixo de todos 
		// Ele é formado por 8 bits
		
		byte minimoByte = -128;
		byte maximoByte = 127;
		
		// O short é formado por 16 bits
		
		short minimoShort = -32768;
		short maximoShort = 32767;
		
		int minimoInt = -2147483648;
		int maximoInt = 2147483647;
		
		long minimoLong = -9223372036854775808L;
		long maximoLong = 9223372036854775807L;
		
		
		
		// VARIAVEIS NUMERICAS PARA TIPO FLUTUANTES(COM VIRGULA/DIVISOES COM NUMEROS NAO EXATOS)
		
		float variavelFloat = 3.6F;
		double variavelDouble = 3.6;
		
		char caractere = 'c';
		
		boolean verdade = true;
		boolean falso = false;
		
		String nome = "Geneton";
	
		System.out.println(minimoByte);
		//Se quiser pode alterar a saída para testar os outros valores das variaveis
	}

}
