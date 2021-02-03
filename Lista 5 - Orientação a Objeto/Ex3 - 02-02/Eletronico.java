// 3) Crie uma classe produto eletrônico e apresente os atributos e métodos
// referentes esta classe, em seguida crie um objeto produto eletrônico,
// defina as instancias deste objeto e apresente as informações deste objeto
// no console.

package POO;

import java.text.NumberFormat;

public class Eletronico {
//atributos
	private String tipo, marca;
	private double valor, desconto, novoValor;
	
//construtor	
	public Eletronico (String tipo_elet, String marca_elet, double valor_elet) {
		
		this.tipo = tipo_elet;
		this.marca = marca_elet;
		this.valor = valor_elet;
	}
// métodos
	public String formatarPreco(){
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoValor = nf.format(valor);
		return formatoValor;
	}
	
	public double aplicarDesconto() {
		desconto = valor*0.3;
		novoValor = valor-(valor*0.3);
		return novoValor;
	}
	public void imprimirInfo () {
		System.out.println("Tipo do eletrônico: "+tipo+"\nMarca: "+marca+"\nValor original: "+this.formatarPreco()+"\nValor com desconto: "+this.aplicarDesconto()+"0");
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public double getNovoValor() {
		return novoValor;
	}
	public void setNovoValor(double novoValor) {
		this.novoValor = novoValor;
	}
}
