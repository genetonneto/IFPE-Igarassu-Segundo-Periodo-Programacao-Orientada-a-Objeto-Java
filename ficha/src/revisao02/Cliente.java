package revisao02;

import java.util.Objects;

public class Cliente {

	public String nome;
	protected float saldo;
	protected int nConta;
	protected float nAgencia;
	public String banco;
	
	Cliente(){
		
	}
	
	Cliente(String nome, float saldo){
		this.nome = nome;
		this.saldo = saldo;
	}
	
	Cliente(int nConta, float nAgencia){
		this.nConta = nConta;
		this.nAgencia = nAgencia;
	}
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	/*
	@Override
	public String toString() {
		return "Nome: " + nome + " Saldo: " + saldo + " Nº Conta: " + nConta + " Nº Agencia: " + nAgencia + " Banco: " + banco;
	}

	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		
		if(this == obj) {
			return true;
		}
		
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		return false;
		
		Cliente novoCliente = (Cliente) obj;
		
	}
	*/
}
