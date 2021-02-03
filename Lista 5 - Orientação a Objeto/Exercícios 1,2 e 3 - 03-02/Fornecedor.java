package TREINANDO;

import java.text.NumberFormat;

public class Fornecedor extends Pessoa {
	private double valorCredito;
	private double valorDivida;
	private double saldo;
	
	public Fornecedor (String nome, String endereco, String telefone, double valorCredito2, double valorDivida2) {
		
		super(nome, endereco, telefone);
		valorCredito = valorCredito2;
		valorDivida = valorDivida2;
		
	}
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void obterSaldo() {
		saldo = valorCredito - valorDivida;
	}
	
	public void valorFormatado() {
		NumberFormat valorFormatado = NumberFormat.getCurrencyInstance();
		System.out.println(valorFormatado);
	}
	public void imprimirSaldo() {
		System.out.println("Saldo de "+this.getNome()+": "+saldo);
	}
}
