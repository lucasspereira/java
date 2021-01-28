// 2- Programa que lê 10 números e imprime quantos são pares e quantos são ímpares.

package Aula;

import java.util.Scanner;

public class pares_e_impares {

	public static void main(String[] args) {
	
		int x, num, contPar=0, contImpar=0, pares=0, impares=0;
		Scanner ler = new Scanner(System.in);
		
		for(x=1;x<=10;x++) {
			System.out.println("Entre com um número: ");
			num = ler.nextInt();
			
			if(num%2==0) {
				num = pares;
				contPar++;
			}
			else if(num%2!=0) {
				num=impares;
				contImpar++;
			}
		}
		System.out.println("Quantidade de pares: "+contPar+ "\nQuantidade de impares: "+contImpar);
	}

}
