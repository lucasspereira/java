//4- Uma empresa desenvolveu uma pesquisa para saber as características
// psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
// era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
// (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
// agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
// pessoas, calcule e mostre: (WHILE)
// o número de pessoas calmas;
// o número de mulheres nervosas;
// o número de homens agressivos;
// o número de outros calmos;
// o número de pessoas nervosas com mais de 40 anos;
// o número de pessoas calmas com menos de 18 anos.


package Aula;

import java.util.Scanner;

public class Exer4_while {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		
		int pessoa=1, idade, sexo, pers, pessoasCalmas=0, contCalmas=0, mulheresNervosas=0, feminino=0, nervosos=0;
		int homensAgressivos=0, outrosCalmos=0, nervosasMais40=0, calmasMenos18=0, numeroPessoas=0;
		while(pessoa>=1 && pessoa<=4) {
			System.out.println("Pessoa :");
			pessoa=ler.nextInt();
			
			System.out.println("Idade :");
			idade=ler.nextInt();
			
			System.out.println("Sexo: \n1-Feminino \n2-Masculino \n3-Outros: ");
			sexo=ler.nextInt();
			
			System.out.println("1-Calma \n2-Nervosa e \n3-Agressiva: ");
			pers=ler.nextInt();
			
			if(pers==1) {
				contCalmas++;
				
			}
			if(sexo==1 && pers==2) {
				mulheresNervosas++;
			}
			
			if(sexo==2 && pers ==3) {
				homensAgressivos++;
			}
			if(sexo==3 && pers==1) {
				outrosCalmos++;
			}
			if(pers==2 && idade>40) {
				nervosasMais40++;
			}
			if(pers==1 && idade<18) {
				calmasMenos18++;
			}
			numeroPessoas++;
		}
		
		System.out.println("Número de pessoas calmas: " + pessoasCalmas);
		System.out.println("Número de mulheres nervosas: " + mulheresNervosas);
		System.out.println("Número de homens agressivos: " + homensAgressivos);
		System.out.println("Número de outros calmos: " + outrosCalmos);
		System.out.println("Número de pessoas nervosas com mais de 40 anos: " + nervosasMais40);
		System.out.println("Número de pessoas calmas com menos de 18 anos: " + calmasMenos18);

		
	}
}
