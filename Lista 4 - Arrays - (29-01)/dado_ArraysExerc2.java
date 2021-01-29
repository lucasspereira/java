// Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
// que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
// imprima a média aritmética dos lançamentos, contabilize e apresente também
// quantas foram as ocorrências da maior pontuação.

package Aula;

import java.util.Scanner;

public class dado_ArraysExerc2 {
	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);
		int lancamentos[] = new int[10], contador, maior=0;
		float media = 0, soma = 0;

		for (contador = 0; contador < 10; contador++) {
			System.out.printf("Pontuação da %2d° jogada: ", contador + 1);
			lancamentos[contador] = entrada.nextInt();
			soma = soma + lancamentos[contador];
			
			if(lancamentos[contador] > maior) {
				maior = lancamentos[contador];
			}
		}
		for (contador = 0; contador < 10; contador++) {
			System.out.printf("\nA pontuação da %2d° jogada foi: %d ", contador + 1, lancamentos[contador], "\n");
		}
		media = soma / 3;
		System.out.println("\nA soma total da pontuação é: " + soma);
		System.out.println("A média aritmética da pontuação é: " + media);
		System.out.println("A maior pontuação foi: " + maior);

	}
}
