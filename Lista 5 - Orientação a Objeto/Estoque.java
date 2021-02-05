/*3- Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/

package POO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque {
	public static void main(String args[]) {

		int opcao, opcaoCategoria, op;
		String fruta, laticinio, produtolh, itemcb, produtoRemovido;

		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);

		List<String> estoqueList = new ArrayList<String>();
		List<String> frutasList = new ArrayList<String>();
		List<String> laticinioList = new ArrayList<String>();
		List<String> LHList = new ArrayList<String>();
		List<String> CBList = new ArrayList<String>();

		System.out.println("************* Bem vindo ao Smartoque *************");
		System.out.println();
		do {
			System.out.println(
					"[1] - Incluir produtos \n[2] - Remover produtos \n[3] - Mostrar estoque \n[4] - Atualizar estoque \n[5] - Ver um estoque específico");
			System.out.println();
			System.out.println("Digite uma opção: ");
			opcao = entrada.nextInt();
			while (opcao < 0 || opcao >= 6) {
				System.out.println("Digite uma opcao válida!");
				opcao = entrada.nextInt();
			}

			if (opcao == 1) {
				System.out.println(
						"[1] - Frutas \n[2] - Laticínios \n[3] - Produtos de Limpeza/Higiene \n[4] - Ítens de Cesta Básica");
				System.out.println("Digite a categoria: ");
				opcaoCategoria = entrada.nextInt();
				if (opcaoCategoria == 1) { //
					System.out.println("Fruta: ");
					fruta = entrada.next();
					estoqueList.add(fruta);
					frutasList.add(fruta);
					System.out.println("[1] - Cadastrar mais frutas \n[0] - Voltar ");
					op = entrada.nextInt();
					while (op != 0) {

						System.out.println("Fruta: ");
						fruta = entrada.next();
						estoqueList.add(fruta);
						frutasList.add(fruta); //
						System.out.println("[1] - Cadastrar mais frutas \n[0] - Voltar ");
						op = entrada.nextInt();
					}

				} else if (opcaoCategoria == 2) {
					System.out.println("Laticínio: ");
					laticinio = entrada.next();
					estoqueList.add(laticinio);
					laticinioList.add(laticinio);

					System.out.println("[1] - Cadastrar mais laticínios \n[0] - Voltar ");
					op = entrada.nextInt();
					while (op != 0) {
						System.out.println("Laticínio: ");
						laticinio = entrada.next();
						estoqueList.add(laticinio);
						laticinioList.add(laticinio);
						System.out.println("[1] - Cadastrar mais laticínios \n[0] - Voltar ");
						op = entrada.nextInt();
					}
				} else if (opcaoCategoria == 3) {
					System.out.println("Produto:  ");
					produtolh = entrada.next();
					estoqueList.add(produtolh);
					LHList.add(produtolh);

					System.out.println("[1] - Cadastrar mais produtos de limpeza/higiene \n[0] - Voltar ");
					op = entrada.nextInt();
					while (op != 0) {
						System.out.println("Produto: ");
						produtolh = entrada.next();
						estoqueList.add(produtolh);
						LHList.add(produtolh);
						System.out.println("[1] - Cadastrar mais produtos de limpeza/higiene \n[0] - Voltar ");
						op = entrada.nextInt();
					}
				} else if (opcaoCategoria == 4) {
					System.out.println("Ítem:  ");
					itemcb = entrada.next();
					estoqueList.add(itemcb);
					CBList.add(itemcb); //

					System.out.println("[1] - Cadastrar mais ítens de Cesta Básica \n[0] - Voltar ");
					op = entrada.nextInt();
					while (op != 0) {

						System.out.println("Ítem: ");
						itemcb = entrada.next();
						estoqueList.add(itemcb);
						CBList.add(itemcb);
						System.out.println("[1] - Cadastrar mais ítens de Cesta Básica \n[0] - Voltar ");
						op = entrada.nextInt(); // fimbloco
					}
				}
			}
			if (opcao == 2) {
				System.out.println("Digite o produto que deseja remover: ");
				produtoRemovido = entrada.next();
				if (estoqueList.contains(produtoRemovido)) {
					estoqueList.remove(produtoRemovido);
				} else {
					System.out.println("Produto não existe no estoque!");
				}
			}
			if (opcao == 3) {
				System.out.println("Estoque de produtos: ");
				System.out.println(estoqueList);
			}
			if (opcao == 4) { // if
				System.out.println("Digite o produto que deseja retirar: ");
				String prodRetirar = entrada.next();
				System.out.println("Digite o produto que deseja incluir: ");
				String prodIncluir = entrada.next();
				if (estoqueList.contains(prodRetirar)) {
					estoqueList.remove(prodRetirar);
					estoqueList.add(prodIncluir);
				} else {
					System.out.println("Produto não existe no estoque!");
				}
			}
			if (opcao == 5) {
				System.out.println("Digite o estoque que deseja visualizar: ");
				System.out.println(
						"[1] - Estoque de Frutas \n[2] - Estoque de Laticínios \n[3] - Estoque de Produtos de Limpeza/Higiene \n[4] - Estoque de Ítens de Cesta Básica");
				int op2 = entrada.nextInt();

				while (op2 <= 0 || op2 >= 5) {
					System.out.println("Por favor, digite uma opção válida! ");
					op2 = entrada.nextInt();
				}

				String op3;
				if (op2 == 1) {
					System.out.println("Estoque de Frutas: ");
					System.out.println(frutasList);
				} else if (op2 == 2) {
					System.out.println("Estoque de Laticínios: ");
					System.out.println(laticinioList);
				} else if (op2 == 3) {
					System.out.println("Estoque de Produtos de Limpeza/Higiene: ");
					System.out.println(LHList);
				} else if (op2 == 4) {
					System.out.println("Estoque de Ítens de Cesta Básica ");
					System.out.println(CBList);
				}

			}

		} while (opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4);
	}
}
