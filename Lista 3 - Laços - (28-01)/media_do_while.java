// 6- Um programa que recebe v�rios n�meros inteiros no teclado. E no
// final imprime a m�dia dos n�meros m�ltiplos de 3. (Para sair, digitar
// 0(zero).(DO...WHILE))

package Aula;

import java.util.Scanner;

public class media_do_while {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num, soma=0, cont=0;
		double media=0.0;
		
		do {
			System.out.println("Digite um n�mero: ");
			num=ler.nextInt();
			
			if(num%3==0 && num!=0) {
				soma=soma+num;
				cont++;
				media = soma/cont;
			}
		} while(num!=0);
		
		System.out.println("A m�dia dos n�meros m�ltiplos de 3 �: "+media);



}
}