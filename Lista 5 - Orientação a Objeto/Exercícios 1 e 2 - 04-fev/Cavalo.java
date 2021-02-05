package POO_polimorfismo;

public class Cavalo extends Animal_classemae {

	protected String nome;
	@Override
	public void emitirSom() {
		System.out.println("Ihiiii");
	}

	@Override
	public void locomocao() {
		System.out.println("Correr");
	}
	@Override
	public void imprimirInfo() {
		System.out.println("SOM DO CAVALO: ");
	}
	@Override
	public void imprimirInfo2() {
		System.out.println("MÉTODO DE LOCOMOÇÃO DO CAVALO: ");
	}
}
