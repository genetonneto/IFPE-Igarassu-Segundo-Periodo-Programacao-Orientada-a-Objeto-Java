import java.util.Scanner; 
public class entradaEsaidaDeDados {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome = "";
		
		System.out.println("Digite o seu nome");
		nome = sc.nextLine();

		System.out.println("Ola " +nome+ " , Hello, World ! ");
	}

}
