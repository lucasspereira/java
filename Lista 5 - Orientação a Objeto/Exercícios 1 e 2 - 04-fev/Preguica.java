package POO_polimorfismo;

public class Preguica extends Animal_classemae {

	protected String nome;
	@Override
	public void emitirSom() {
		System.out.println("N�o sei o som que a pregui�a faz kkk");
	}

	@Override
	public void locomocao() {
		System.out.println("Subir em �rvore");
	}
	@Override
	public void imprimirInfo() {
		System.out.println("SOM DA PREGUI�A: ");
	}

	@Override
	public void imprimirInfo2() {
		System.out.println("M�TODO DE LOCOMO��O DA PREGUI�A: ");		
	}
}
