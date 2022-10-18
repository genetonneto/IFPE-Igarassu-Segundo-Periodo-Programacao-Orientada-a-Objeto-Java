package avaliaçaoq2;
import java.util.Objects;

public class Conta {
	String nomeBanco;
	float conta;
	float saldo;
	boolean ativada;
	boolean desativada;
	
	
	public Conta(String nomeBanco, float conta, float saldo) {
		this.nomeBanco = nomeBanco;
		this.conta = conta;
		this.saldo = saldo;
		this.status();
		this.contaAtivada();
		this.consultarSaldo();
		this.sacar();
		this.transferir();	
	}
	
	public Conta() {
		
	}
	
	@Override
	public String toString() {
		return "Conta [nomeBanco=" + nomeBanco + ", conta=" + conta + ", saldo=" + saldo + ", ativada=" + ativada
				+ ", desativada=" + desativada + "]";
	}
	
	public void status() {
		
	}
	
	
	public void contaAtivada() {
		this.ativada = true;
	}
	
	public void contaDesativada() {
		this.desativada = false;
	}
	
	public void consultarSaldo() {
		if(this.ativada == true && this.desativada == false) {
			System.out.println("Seu saldo atual é " + this.saldo);
		} else {
			System.out.println("ERRO! Sua conta precisa estar ativada");
		}
	}

	public void sacar() {
		if(this.saldo >= 0 && this.ativada == true && this.desativada == false) {
			System.out.println("Retire o dinheiro na boca do caixa");
		} else {
			System.out.println("Impossivel realizar saque");
		}
	}
	
	public void transferir() {
		if(this.saldo >= 0 && this.ativada == true && this.desativada == false) {
			System.out.println("Transação autorizada");
		} else {
			System.out.println("Transação não atorizada");
		}
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(ativada, conta, desativada, nomeBanco, saldo);
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
		return ativada == other.ativada && Float.floatToIntBits(conta) == Float.floatToIntBits(other.conta)
				&& desativada == other.desativada && Objects.equals(nomeBanco, other.nomeBanco)
				&& Float.floatToIntBits(saldo) == Float.floatToIntBits(other.saldo);
	}
}

	
	
