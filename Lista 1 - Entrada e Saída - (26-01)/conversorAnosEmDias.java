// 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
// dias e mostre-a expressa apenas em dias.

package Aula;

import java.util.Scanner;

public class conversorAnosEmDias {
	public static void main (String args[]) {
		
		int anosEmDias, idade, somaTotalDias;
		int dias, meses, dias2, diasEmDias, mesesEmDias;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sua idade (em anos): ");
		idade = ler.nextInt();
		
		System.out.println("Meses: ");
		meses = ler.nextInt();
		
		System.out.println("Dias: ");
		dias = ler.nextInt();
		
		anosEmDias = idade*365;
		mesesEmDias = meses*30;
		diasEmDias = dias*1;
		somaTotalDias = anosEmDias + mesesEmDias + diasEmDias;
		
		System.out.println("Você tem "+somaTotalDias+ " dias de vida!!!");
		
	}
}
