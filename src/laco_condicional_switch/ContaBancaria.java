package laco_condicional_switch;

import java.util.Scanner;

public class ContaBancaria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int codigo = 0;
		double saldo = 1000, formula = 0, valor;
		
		
		
		System.out.println("\t\t Tabela de Operações");
		System.out.println("\nCódigo  Operação");
		System.out.println("\n1 --- Saldo ");
		System.out.println("\n2 --- Saque ");
		System.out.println("\n3 --- Depósito");
		System.out.println("\nInsira o código: ");
		codigo = sc.nextInt();
		
		switch(codigo) {
		case 1:
			System.out.println("Operação - Saldo");
			System.out.printf("\nR$%.2f", saldo);
			break;
		case 2:
			System.out.println("Operação - Saque");
			System.out.println("\nInsira o valor: ");
			valor = sc.nextDouble();
			formula = saldo - valor;
			if (formula <0) {
				System.out.println("Saldo Insuficiente!");
			} else {
				System.out.printf("\nNovo Saldo: R$%.2f", formula);
			}
			break;
		case 3:
			System.out.println("Operação - Depósitp");
			System.out.println("\nInsira o valor: ");
			valor = sc.nextDouble();
			formula = saldo + valor;
			System.out.printf("\nNovo Saldo: R$%.2f", formula);
			break;
		default:
			System.out.println("Operação Inválida");			
		}
		
	}

}
