// 5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
// aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
// respectivamente.


package Aula;

import java.util.Scanner;

public class mediaPonderadaExerc4 {
	public static void main (String args []) {
		
		float nota1, nota2, nota3, mediaGeral, notaPeso2, notaPeso3, notaPeso5;
		String nome, RA;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Primeiro nome do aluno: ");
		nome = ler.next();
		
		System.out.println("RA do aluno: ");
		RA = ler.next();
		
		System.out.println("Nota 1 do aluno: ");
		nota1 = ler.nextFloat();
		
		System.out.println("Nota 2 do aluno: ");
		nota2 = ler.nextFloat();
		
		System.out.println("Nota 3 do aluno: ");
		nota3 = ler.nextFloat();
		
		notaPeso2 = nota1*2;
		notaPeso3 = nota2*3;
		notaPeso5 = nota3*5;
		
		mediaGeral = (notaPeso2 + notaPeso3 + notaPeso5)/10;
		
		System.out.println("A media geral de "+nome+" é "+mediaGeral);
	}
}
