// 8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
// percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
// Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
// escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
// consumidor.

package Aula;

import java.util.Scanner;

public class custoFinalExerc8 {
	public static void main (String args[]) {
		
		Scanner ler = new Scanner(System.in);
		double custoConsumidor;
		float custoFabrica;
		double porcentagemDistribuidor;
		double impostos;
		
		System.out.println("Digite o valor do custo de f�brica do ve�culo R$");
		custoFabrica = ler.nextFloat();
		
		impostos = custoFabrica*0.45;
		porcentagemDistribuidor = custoFabrica*0.28;
		custoConsumidor = custoFabrica + porcentagemDistribuidor + impostos;
		
		System.out.println("O custo final do ve�culo � R$"+custoConsumidor+"0");
	}
}
