// 2- Um programa que l� tr�s n�meros e os coloca em ordem crescente.

package Aula;

import java.util.Scanner;

public class ordemCrescenteExerc2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num1, num2, num3, menor=0, maior=0, medio=0;
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = ler.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		num2 = ler.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		num3 = ler.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			maior = num1;
			if(num2>num3) {
				menor=num3;
				medio=num2;
			}
				else if (num3>num2) {
					medio = num3;	
				}
			
		}
		if(num2>num1 && num2>num3) {
			maior=num2;
			if(num1>num3) {
				menor = num3;
				medio = num1;
				
			}
			else if(num3>num1) {
				medio = num3;
			}
		}
		if(num3>num2 && num3>num1) {
			maior = num3;
			if(num2>num1) {
				medio = num2;
				menor = num1;
			}
			else if(num1>num2) {
				medio = num1;
			}
		}
		System.out.println("O n�mero maior �: "+maior);
		System.out.println("\nO n�mero medio �: "+medio);
		System.out.println("\nO n�mero menor �: "+menor);
	}

}