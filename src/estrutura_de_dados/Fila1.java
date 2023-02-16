package estrutura_de_dados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila1 {

	public static void main(String[] args) {

		// Cria uma instância para ler a entrada do usuario
		Scanner leia = new Scanner(System.in);

		// Cria um objeto (fila) que serve como Queue para organizar os elementos
		Queue<String> fila = new LinkedList<>();

		// Declara as variaveis
		int op;
		String cliente;

		// Cria um laço de repetição para que o usuario, adiciona ou remova os clientes
		// e também visualiza a quais são os clientes
		do {

			System.out.println("**********************************************");
			System.out.println();
			System.out.println("\t1 - Adicionar Cliente na Fila");
			System.out.println("\t2 - Listar todos os Clientes");
			System.out.println("\t3 - Retirar Cliente da Fila");
			System.out.println("\t0 - Sair");
			System.out.println();
			System.out.println("**********************************************");
			System.out.println();
			op = leia.nextInt();

			switch (op) {

			case 1:
				leia.nextLine();
				System.out.println("\nFila: ");
				System.out.println();
				cliente = leia.nextLine();
				fila.add(cliente);
				System.out.println();
				System.out.println("\nCliente Adicionado!!");
				break;

			case 2:
				leia.nextLine();
				System.out.println("\nLista de Clientes na Fila: ");
				System.out.println();
				
				if(fila.isEmpty()) {
					System.out.println("A Fila está vazia!");
				} else {
					Iterator<String> iFila = fila.iterator();
					while (iFila.hasNext()) {
						System.out.println(iFila.next());
					}
					System.out.println();
				}
				break;

			case 3:
				leia.nextLine();
				fila.remove();
				System.out.println();
				Iterator<String> iFila2 = fila.iterator();
				while (iFila2.hasNext()) {
					System.out.println(iFila2.next());
				}
				System.out.println();
				System.out.println("\nO Cliente foi Chamado!!");
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
