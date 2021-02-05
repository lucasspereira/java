package POO_polimorfismo;

public class Cachorro extends Animal_classemae {

	protected String nome;

	@Override
	public void emitirSom() {
		System.out.println("AU AU AU");
	}

	@Override
	public void locomocao() {
		System.out.println("Correr");
	}

	@Override
	public void imprimirInfo() {
		System.out.println("SOM DO CACHORRO: ");
	}

	@Override
	public void imprimirInfo2() {
		System.out.println("MÉTODO DE LOCOMOÇÃO DO CACHORRO: ");
	}

}
