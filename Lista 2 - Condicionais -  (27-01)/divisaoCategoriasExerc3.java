//3- Um programa que recebe a idade de uma pessoa e mostra na sa�da em qual
// categoria ela se encontra:
// * 10-14 infantil
// * 15-17 juvenil
// * 18-25 adulto

package Aula;

import java.util.Scanner;

public class divisaoCategoriasExerc3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite a idade do atleta: ");
		idade = ler.nextInt();
		
		if (idade >=10 && idade<=14) {
			System.out.println("O atleta � da categoria INFANTIL");
		}
		else if(idade>=15 && idade<=17) {
			System.out.println("O atleta � da categoria JUVENIL");
		}
		else if(idade>=18 && idade <=25) {
			System.out.println("O atleta � da categoria ADULTO");
		}
		else {
			System.out.println("A idade m�nima para competi��es � de 10 anos e a m�xima � de 25 anos. Por favor, digite uma idade v�lida!!!");
		}
		
	}

}
