package avaliaçaoq1;
import java.util.Objects;
import java.util.ArrayList;

public class Paciente {
	String cpf;
	String nome;
	float altura;
	float peso;
	char sexo;
	float imc;
	int idade;
	ArrayList <Exame> exames = new ArrayList<>(); 
	
	public Paciente(String cpf, String nome, float altura, float peso, char sexo, float imc, int idade) {
		this.cpf = cpf;
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
		this.imc = imc;
		this.idade = idade;
	}
	
	public Paciente(String cpf) {
		this.cpf = cpf;
		this.nome = "Geneton";
		this.altura = 1.82f;
		this.peso = 77.2f;
		this.sexo = 'M';
		//this.imc = imc;
		this.idade = 23;
	}
	
	public float calcularIMC() {
		return peso / (altura * altura);
	}

	public float calcularMetabolismoBasal() {
		if(this.sexo == 'F' && this.idade <= 3) {
			return (61.0f * this.peso - 51);
		}else if(this.sexo == 'F' && this.idade > 3 && this.idade <= 10) {
			return (22.5f * this.peso + 499);
		}else if(this.sexo == 'F' && this.idade > 10 && this.idade <= 18) {
			return(12.2f * this.peso + 749);
		}else if (this.sexo == 'M' && this.idade <= 3) {
			return (60.9f * this.peso - 54);
		}else if(this.sexo == 'M' && this.idade > 3 && this.idade <= 10) {
			return (22.7f * this.peso + 495);
		}else {
			return (17.7f * this.peso + 651);
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		return Objects.equals(cpf, other.cpf);
	}

	@Override
	public String toString() {
		return "Paciente [cpf=" + cpf + ", nome=" + nome + "]";
	}

	
}