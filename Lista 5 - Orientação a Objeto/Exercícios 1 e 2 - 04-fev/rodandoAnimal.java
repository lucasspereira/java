/* Implemente um programa que crie os 3 tipos de animais definidos no exercício
anterior e invoque o método que emite o som de cada um de forma polimórfica, isto
é, independente do tipo de animal.*/

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
		
	
		
		Preguica preguiça = new Preguica();
		System.out.println("****PREGUIÇA****");
		preguiça.imprimirInfo();
		preguiça.emitirSom();
		preguiça.imprimirInfo2();
		preguiça.locomocao();
		
		System.out.println(" ");
		System.out.println("*********FIM*********");

	}

}
