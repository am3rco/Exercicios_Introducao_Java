package exercicio_collection_reforço;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection2 {

	public static void main(String[] args) {

		// Cria uma instância para ler a entrada do usuário
		Scanner leia = new Scanner(System.in);

		// Cria uma lista de Array
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		// Declara as Variaveis
		int numero;
		boolean encontrado = false;

		System.out.println("\nDigite o número que você deseja encontrar: ");
		numero = leia.nextInt();

		// Verifica se o numero selecionado se encontra na Array e mostra onde ele está nos indices
		if (numeros.contains(numero) == true) {
			System.out.println("\nO número " + numero + " está localizado na posição: " + numeros.indexOf(numero));
			encontrado = true; 
		}

		if (!encontrado) {
			System.out.println("\nO número " + numero + " não foi encontrado");
		}

	}

}
