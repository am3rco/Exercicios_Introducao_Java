package exercicio_collection_reforço;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Collection4 {

	public static void main(String[] args) {
		
		// Cria uma instância para ler a entrada do usuário
		Scanner leia = new Scanner (System.in);
		
		// Cria uma TreeSet para ordenar os elementos em forma crescente
		Set<Integer> numeros = new TreeSet<>();
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
		
		// Declara uma variavel
		int numero;
		boolean encontrado = false;

		System.out.println("\nDigite o número que você deseja encontrar: ");
		numero = leia.nextInt();

		// Verifica se o numero selecionado se encontra na TreeSet.
		if (numeros.contains(numero) == true) {
			System.out.println("\nO número " + numero +" foi encontrado!");
			
		} else{
			System.out.println("\nO número " + numero + " não foi encontrado!");
		}
		
		
	}
	
}
