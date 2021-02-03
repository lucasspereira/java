// 1) Crie uma classe cliente e apresente os atributos e métodos referentes
// esta classe, em seguida crie um objeto cliente, defina as instancias deste
// objeto e apresente as informações deste objeto no console.

package POO;

public class Cliente {
	private String nome;
	private String cidade;
	private int codigo;

	public Cliente (String nome_cliente, String cidade_cliente, int codigo_cliente) {
		nome = nome_cliente;
		cidade = cidade_cliente;
		codigo = codigo_cliente;
	}
	public String getDados_cliente() {
		String Dados_cliente = nome + " " + cidade +" "+codigo;
		return Dados_cliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}