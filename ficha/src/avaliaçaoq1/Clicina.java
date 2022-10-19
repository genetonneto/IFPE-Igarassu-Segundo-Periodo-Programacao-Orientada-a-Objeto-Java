package avaliaçaoq1;

public class Clicina {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente("123", "Gene", 1.82f, 76.2f,'M',22.4f ,23);
		System.out.println(p1.toString());
		
		Paciente p2 = new Paciente("123");
		System.out.println(p2.toString());
	}
}
