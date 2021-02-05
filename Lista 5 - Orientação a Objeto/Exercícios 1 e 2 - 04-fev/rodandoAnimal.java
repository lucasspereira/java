/* Implemente um programa que crie os 3 tipos de animais definidos no exerc�cio
anterior e invoque o m�todo que emite o som de cada um de forma polim�rfica, isto
�, independente do tipo de animal.*/

package POO_polimorfismo;

public class rodandoAnimal {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();	
		System.out.println("****CACHORRO****");
		cachorro.imprimirInfo();
		cachorro.emitirSom();
		cachorro.imprimirInfo2();
		cachorro.locomocao();
		System.out.println("*****************************");
		System.out.println(" ");
		
		Cavalo cavalo = new Cavalo();
		System.out.println("****CAVALO****");
		cavalo.imprimirInfo();
		cavalo.emitirSom();
		cavalo.imprimirInfo2();
		cavalo.locomocao();
		System.out.println("*****************************");
		System.out.println(" ");
		
	
		
		Preguica pregui�a = new Preguica();
		System.out.println("****PREGUI�A****");
		pregui�a.imprimirInfo();
		pregui�a.emitirSom();
		pregui�a.imprimirInfo2();
		pregui�a.locomocao();
		
		System.out.println(" ");
		System.out.println("*********FIM*********");

	}

}
