// 1- Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
// atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.

package Aula;

import java.util.Scanner;

public class maiorPontuacao_array {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int pontuacao[] = new int[5], contador, menor = 0, maior = 0;

		for (contador = 0; contador < 5; contador++) {
			System.out.printf("Entre com a %2d� pontua��o: ", contador + 1);
			pontuacao[contador] = entrada.nextInt();

			if (pontuacao[contador] > maior) {
				maior = pontuacao[contador];
			}
			if (pontuacao[contador] < menor) {
				menor = pontuacao[contador];
			}
		}

		for (contador = 0; contador < 5; contador++) {
			System.out.printf("\nA %2d� pontua��o foi: %d ", contador + 1, pontuacao[contador]);

		}
		System.out.println("\nA maior pontua��o foi: " + maior);
	}
}