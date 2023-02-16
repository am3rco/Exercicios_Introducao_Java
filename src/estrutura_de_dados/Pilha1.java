package estrutura_de_dados;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Pilha1 {

	public static void main(String[] args) {

		// Cria uma Stack (livros), o ultimo que entra é o primeiro que sai
		Stack<String> livros = new Stack<String>();

		// Declara as Variaveis
		int op;

		// Cria uma instância para ler a entrada do usuario
		Scanner leia = new Scanner(System.in);

		do {

			System.out.println("**********************************************");
			System.out.println();
			System.out.println("\t1 - Adicionar Livro na Pilha");
			System.out.println("\t2 - Listar todos os Livros");
			System.out.println("\t3 - Retirar Livro da Pilha");
			System.out.println("\t0 - Sair");
			System.out.println();
			System.out.println("**********************************************");
			System.out.println();
			op = leia.nextInt();

			switch (op) {

			case 1:
				leia.nextLine();
				System.out.println("\nPilha: ");
				System.out.println();
				String cliente = leia.nextLine();
				livros.push(cliente);
				System.out.println();
				System.out.println("\nLivro Adicionado!!");
				break;

			case 2:
				leia.nextLine();
				System.out.println("\nLista de Livros na Pilha: ");
				System.out.println();
				if (livros.isEmpty()) {
					System.out.println("A Pilha está vazia!");
				} else {
					Iterator<String> iLivros = livros.iterator();
					while (iLivros.hasNext()) {
						System.out.println(iLivros.next());
					}
				}
				break;

			case 3:
				leia.nextLine();
				livros.pop();
				System.out.println();
				Iterator<String> iLivros = livros.iterator();
				while (iLivros.hasNext()) {
					System.out.println(iLivros.next());
				}
				System.out.println();
				System.out.println("\nUm Livro foi Retirado da Pilha!!");
				System.out.println();
				break;

			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;

			default:
				System.out.println("\nOpção Inválida!!!");
			}

		} while (op != 0);

	}

}
