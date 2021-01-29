// Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
// que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
// imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
// quantas foram as ocorr�ncias da maior pontua��o.

package Aula;

import java.util.Scanner;

public class dado_ArraysExerc2 {
	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);
		int lancamentos[] = new int[10], contador, maior=0;
		float media = 0, soma = 0;

		for (contador = 0; contador < 10; contador++) {
			System.out.printf("Pontua��o da %2d� jogada: ", contador + 1);
			lancamentos[contador] = entrada.nextInt();
			soma = soma + lancamentos[contador];
			
			if(lancamentos[contador] > maior) {
				maior = lancamentos[contador];
			}
		}
		for (contador = 0; contador < 10; contador++) {
			System.out.printf("\nA pontua��o da %2d� jogada foi: %d ", contador + 1, lancamentos[contador], "\n");
		}
		media = soma / 3;
		System.out.println("\nA soma total da pontua��o �: " + soma);
		System.out.println("A m�dia aritm�tica da pontua��o �: " + media);
		System.out.println("A maior pontua��o foi: " + maior);

	}
}
