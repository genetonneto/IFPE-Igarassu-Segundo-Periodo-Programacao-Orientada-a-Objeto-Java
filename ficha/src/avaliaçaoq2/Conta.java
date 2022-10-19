package avaliaçaoq2;
import java.util.Objects;

public class Conta {
	String nomeBanco;
	float numeroConta;
	float saldo;
	boolean status;
	
	
	public Conta(String nomeBanco) {
		this.nomeBanco = nomeBanco;
		this.numeroConta = 1234.5f;
		this.saldo = 1f;
		this.status = true;
	}
	
	public Conta() {
		
	}
	
	public void contaAtivada() {
		this.status = true;
	}
	
	public void contaDesativada() {
		this.status = false;
	}
	
	public void consultarSaldo() {
		if(this.status == true) {
			System.out.println("Seu saldo atual é " + this.saldo);
		} else {
			System.out.println("ERRO! Sua conta precisa estar ativada");
		}
	}

	public boolean sacar(float quantia) {
		if(quantia > 0 && this.saldo <= quantia && this.status == true) {
			this.saldo -= quantia;
			return true;
		}else {
			return false;
		}
	}
	
	public void transferir(float quantia, Conta destino) {
		if(quantia > 0 && this.saldo >= quantia && destino.status && this.status) {
			this.saldo -= quantia;
			destino.saldo += quantia;
			System.out.println("Tudo ok");
		}else {
			System.out.println("Erro ! A transferencia não pode ser realizada!");
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroConta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return Float.floatToIntBits(numeroConta) == Float.floatToIntBits(other.numeroConta);
	}

	@Override
	public String toString() {
		return "Conta [nomeBanco=" + nomeBanco + ", numeroConta=" + numeroConta + ", saldo=" + saldo + ", status="
				+ status + "]";
	}	
}