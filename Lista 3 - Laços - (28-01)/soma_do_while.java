// 5- Um programa que l� um n�mero do teclado at� que encontre um
// n�mero igual a zero. No final, mostrar� a soma dos n�meros
// digitados.(DO...WHILE)


package Aula;

import java.util.Scanner;

public class soma_do_while {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int num, soma=0;
		
		do {
			System.out.println("Dgite um n�mero: ");
			num=ler.nextInt();
			soma = soma + num;
		}
		while(num!=0);
		
		System.out.println("A soma dos n�mero digitados �: "+soma);
	}

}
