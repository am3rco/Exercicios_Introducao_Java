package exercicio_collection_reforço;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class collection1 {

	public static void main(String[] args) {

		// Cria uma instância para ler a entrada do usuario
		Scanner leia = new Scanner(System.in);

		// Cria uma Lista de Array
		ArrayList<String> corLista = new ArrayList<>();

		// Declara as variaveis
		int x;
		String cor;

		// O usuario adiciona as cores para a lista
		for (x = 1; x <= 5; x++) {
			System.out.println("\nInsira a " + x + "° cor: ");
			cor = leia.next();
			corLista.add(cor);
		}

		// Imprime todas as cores uma em cima da outra
		System.out.println("Listar todas as cores:");
		System.out.println();
		for (String listaElementos : corLista) {
			System.out.println(listaElementos);
		}
		System.out.println();
	
		// Ordena a lista de forma alfabetica
		Collections.sort(corLista);
		System.out.println("Ordenar as cores:");
		System.out.println();
		for (String listaElementos : corLista) {
			System.out.println(listaElementos);
		}
		
	}

}
