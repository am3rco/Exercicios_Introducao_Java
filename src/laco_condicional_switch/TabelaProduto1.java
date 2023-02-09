package laco_condicional_switch;

import java.util.Scanner;

public class TabelaProduto1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome = "";
		int codigo, quantidade;
		double valor = 0, valorTotal;
		
		System.out.println("\t\t Menu de Comida");
		System.out.println("\n1 - Cachorro Quente --- R$10.00");
		System.out.println("\n2 - X-Salada --- R$15.00");
		System.out.println("\n3 - X-Bacon --- R$18.00");
		System.out.println("\n4 - Bauru --- R$12.00");
		System.out.println("\n5 - Refrigerante --- R$8.00");
		System.out.println("\n6 - Suco de Laranja --- R$13.00");
		System.out.println("Digite o código de seu produto que se encontra na esquerda: ");
		codigo = leia.nextInt();

		System.out.println("\nDigite a quantidade que você quer comprar: ");
		quantidade = leia.nextInt();
		
		switch(codigo) {
		case 1:
			valor = 10;
			nome = "Cachorro Quente";
			break;
		case 2:
			valor = 15;
			nome = "X-Salada";
			break;
		case 3:
			valor = 18;
			nome = "X-Bacon";
			break;
		case 4:
			valor = 12;
			nome = "Bauru";
			break;
		case 5:
			valor = 8;
			nome = "Refrigerante";
			break;
		case 6:
			valor = 13;
			nome = "Suco de Laranja";
			break;
		default:
			System.out.println("Insira um código válido.");
		}
		
		
		valorTotal = quantidade * valor;
		System.out.println("\nProduto: "+nome );
		System.out.printf("\nValor Total: %.2f",valorTotal);
		
	}

}
