// 5- Um programa que lê um número do teclado até que encontre um
// número igual a zero. No final, mostrará a soma dos números
// digitados.(DO...WHILE)


package Aula;

import java.util.Scanner;

public class soma_do_while {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int num, soma=0;
		
		do {
			System.out.println("Dgite um número: ");
			num=ler.nextInt();
			soma = soma + num;
		}
		while(num!=0);
		
		System.out.println("A soma dos número digitados é: "+soma);
	}

}
