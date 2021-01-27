package Aula;

import java.util.Scanner;

public class calculoDeExpressao_Exerc4 {
	public static void main(String args[]) {
		
		int a, b, c;
		double s;
		double r;
		double d;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		a = ler.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = ler.nextInt();
		
		System.out.println("Digite o valor de C: ");
		c = ler.nextInt();
		
		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);
		d = (r+s)/2;
		
		System.out.println("O resultado de 'D' é "+d);
	}
}
