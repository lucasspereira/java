// 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
// expressa em segundos e mostre-o expresso em horas, minutos e segundos.

package Aula;

import java.util.Scanner;

public class conversorSegundosEmHoraseMin {
	public static void main(String args[]){
		
		Scanner ler = new Scanner(System.in);
		
		int duracaoEmSeg,duracaoEmSeg2;
		int duracaoEmHoras, duracaoEmMin;
		
		System.out.println("Digite a duração (em segundos): ");
		duracaoEmSeg = ler.nextInt();
		
		duracaoEmHoras = duracaoEmSeg/3600;
		duracaoEmMin = (duracaoEmSeg%3660)/60;
		duracaoEmSeg2 = (duracaoEmSeg%60)*1;
		
		System.out.println("O evento durou "+duracaoEmHoras+" horas,"+duracaoEmMin+" minutos e "+duracaoEmSeg2+" segundos.");
	}
}
