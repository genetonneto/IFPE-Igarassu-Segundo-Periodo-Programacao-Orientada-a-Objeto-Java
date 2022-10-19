package avaliaçaoq2;

import java.util.Objects;

public class Conta {
	
	//String nomeBanco;
	String numeroConta;
	float saldo;
	boolean status;
	
	public Conta(String numeroConta) {
		//this.nomeBanco = nomeBanco;
		this.numeroConta = numeroConta;
		this.saldo = 0f;
		this.status = true;
	}
	
	public void contaAtivada() {
		if(this.status == false) {
			this.status = true;
		}
	}
	
	public void contaDesativada() {
		if(this.status == true) {
			this.status = false;
		}
	}
	
	public void consultarSaldo() {
		if(this.status == true) {
			System.out.println("Seu saldo atual é " + this.saldo);
		} else {
			System.out.println("ERRO! Sua conta precisa estar ativada");
		}
	}

	public boolean sacar(float quantia) {
		if(quantia > 0 && this.saldo >= quantia && this.status == true) {
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
		return Objects.equals(numeroConta, other.numeroConta);
	}

	@Override
	public String toString() {
		return "Conta [numeroConta=" + numeroConta + ", saldo=" + saldo + ", status=" + status + "]";
	}
	
	
}
