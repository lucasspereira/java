// 1- Programa que recebe tr�s inteiros e diz qual deles � o maior.

package Aula;

import java.util.Scanner;

public class maiorExerc1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num1, num2, num3, maior=0;
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = ler.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		num2 = ler.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		num3 = ler.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			maior = num1;
		}
		else if(num2>num1 && num2>num3) {
			maior = num2;
		}
		else if (num3>num1 && num3>num1) {
			maior = num3;
		}
		System.out.println("O maior � o n�mero "+maior);
		
	}
	
}
