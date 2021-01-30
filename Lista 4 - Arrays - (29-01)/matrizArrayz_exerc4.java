// 4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
// em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
// diagonal, ou seja, diagonal principal.

package Aula;

import java.util.Scanner;

public class matrizArrayz_exerc4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int matriz[][] = new int[3][3], linha, coluna, somaMatriz=0, somaDiagonal=0;

		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna <3; coluna++) {
				System.out.println("Digite os valores da matriz: ");
				matriz[linha][coluna] = entrada.nextInt();
				somaMatriz = somaMatriz + matriz[linha][coluna];
				
				if(linha == coluna) {
					somaDiagonal = somaDiagonal + matriz[linha][coluna];
				}
			}
		}
		System.out.println("A soma total da matriz é: "+somaMatriz);
		System.out.println("\nA soma da diagonal principal da matriz é: "+somaDiagonal);
	}

}
