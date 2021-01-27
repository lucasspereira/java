// 4- Um programa que permite a entrada de um número qualquer e exiba se este
// número é par ou ímpar. Se for par exibirá também a raiz quadrada do mesmo; se for
// ímpar exibará o número elevado ao quadrado.


package Aula;

import java.util.Scanner;

public class raiz_e_potencia {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float numero;
		double raizPar, potImpar;
		boolean par;
		
		System.out.println("Digite um número: ");
		numero = ler.nextFloat();
		
		if(numero%2==0){
			raizPar = Math.sqrt(numero);
			System.out.println("O número "+numero+" é par e sua raiz quadrada é "+ raizPar);
		}
		else if(numero%2!=0) {
			potImpar = Math.pow(numero, 2);
			System.out.println("O número "+numero+" é ímpar e sua potência é "+potImpar);
		}
	}

}
