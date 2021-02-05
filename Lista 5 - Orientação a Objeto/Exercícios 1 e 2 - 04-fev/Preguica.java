package POO_polimorfismo;

public class Preguica extends Animal_classemae {

	protected String nome;
	@Override
	public void emitirSom() {
		System.out.println("Não sei o som que a preguiça faz kkk");
	}

	@Override
	public void locomocao() {
		System.out.println("Subir em árvore");
	}
	@Override
	public void imprimirInfo() {
		System.out.println("SOM DA PREGUIÇA: ");
	}

	@Override
	public void imprimirInfo2() {
		System.out.println("MÉTODO DE LOCOMOÇÃO DA PREGUIÇA: ");		
	}
}
