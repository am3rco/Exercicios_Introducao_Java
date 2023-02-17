package exercicio_collection_reforço;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Collection3 {

	public static void main(String[] args) {
		
		// Cria uma instância para ler a entrada do usuario
		Scanner leia = new Scanner(System.in);
		
		// Cria uma TreeSet para ordenar os elementos em forma crescente
		Set<Integer> numeros = new TreeSet<>();
		
		// Declarando as Variaveis
		int numero, op;
		
		// Pede para o usuário inserir um número 10 vezes
		for(op = 0; op < 10; op++) {
			System.out.println("\nInsira o "+(op+1)+"° valor para a Collection: ");
			System.out.println("(Evite numeros repetidos)");
			numero = leia.nextInt();
			numeros.add(numero);
		}
		System.out.println();
		
		// Imprime os elementos que estão na TreeSet
		Iterator<Integer> iNumeros = numeros.iterator();
		System.out.println("Listar Dados do Set: ");
		System.out.println();
		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}

	}

}
