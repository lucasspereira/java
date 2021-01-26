// 8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
// percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
// Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
// escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
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
		
		System.out.println("Digite o valor do custo de fábrica do veículo R$");
		custoFabrica = ler.nextFloat();
		
		impostos = custoFabrica*0.45;
		porcentagemDistribuidor = custoFabrica*0.28;
		custoConsumidor = custoFabrica + porcentagemDistribuidor + impostos;
		
		System.out.println("O custo final do veículo é R$"+custoConsumidor+"0");
	}
}
