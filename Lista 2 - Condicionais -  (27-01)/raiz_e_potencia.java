// 4- Um programa que permite a entrada de um n�mero qualquer e exiba se este
// n�mero � par ou �mpar. Se for par exibir� tamb�m a raiz quadrada do mesmo; se for
// �mpar exibar� o n�mero elevado ao quadrado.


package Aula;

import java.util.Scanner;

public class raiz_e_potencia {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float numero;
		double raizPar, potImpar;
		boolean par;
		
		System.out.println("Digite um n�mero: ");
		numero = ler.nextFloat();
		
		if(numero%2==0){
			raizPar = Math.sqrt(numero);
			System.out.println("O n�mero "+numero+" � par e sua raiz quadrada � "+ raizPar);
		}
		else if(numero%2!=0) {
			potImpar = Math.pow(numero, 2);
			System.out.println("O n�mero "+numero+" � �mpar e sua pot�ncia � "+potImpar);
		}
	}

}
