// 2) Crie uma classe avião e apresente os atributos e métodos referentes
// esta classe, em seguida crie um objeto avião, defina as instancias deste
// objeto e apresente as informações deste objeto no console.


package POO;

public class Avião {
	private String cor;
	private String modelo;
	private String capacidade;

public Avião(String cor_Aviao, String modelo_Aviao, String capacidade_Aviao) {
	cor = cor_Aviao;
	modelo = modelo_Aviao;
	capacidade = capacidade_Aviao;

}
	public String getDados_Aviao() {
		String Dados_Aviao = cor+" "+modelo+" "+capacidade;
		return Dados_Aviao;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}
	
}
