// 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
// 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
// idade for =-99. (WHILE)

package Aula;

import java.util.Scanner;

public class contadador_idade {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);

		int idade=0, contMenores21 = 0, contMaiores50 = 0, pessoasMenores21 = 0, pessoasMaiores50 = 0;

		while(idade!=-99) {
		
		System.out.println("Digite a idade: ");
		idade = ler.nextInt();
			
			if (idade < 21 && idade>0) {
				idade = pessoasMenores21;
				contMenores21++;
			} else if (idade >= 50) {
				idade = pessoasMaiores50;
				contMaiores50++;
			}
		}
		System.out.println("Total de pessoas menores de 21 anos: "+contMenores21+ "\nTotal de essoas maiores de 51 anos: "+contMaiores50);
	}
}
