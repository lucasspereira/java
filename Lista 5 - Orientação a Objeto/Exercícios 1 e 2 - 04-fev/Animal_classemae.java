/*1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
 comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal:*/

package POO_polimorfismo;

public abstract class Animal_classemae {
	protected String nome;
	protected int idade;
	public abstract void emitirSom();
	public abstract void locomocao();
	public abstract void imprimirInfo();
	public abstract void imprimirInfo2();

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

}
