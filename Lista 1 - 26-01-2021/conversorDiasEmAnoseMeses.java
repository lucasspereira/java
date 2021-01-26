// 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
// expressa em anos, meses e dias.

package Aula;

import java.util.Scanner;

public class conversorDiasEmAnoseMeses {
	public static void main (String args[]) {
	
		int idadeEmDias;
		int  meses, dias, anos;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sua idade (em dias): ");
		idadeEmDias = ler.nextInt();
		
		anos = idadeEmDias/365;
		meses = (idadeEmDias%365)/30;
		dias = (idadeEmDias%30)%30;
		
		System.out.println("Você tem "+anos+ " anos, "+meses+" meses e "+dias+ " dias");
	}

}
