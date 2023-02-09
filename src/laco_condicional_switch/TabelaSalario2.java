package laco_condicional_switch;

import java.util.Scanner;

public class TabelaSalario2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome, cargo = "";
		int codigo;
		double salario, salarioTotal, reajuste = 0;	
		
		System.out.println("\t\t Tabela de Cargo");
		System.out.println("\nCódigo  Cargo   Reajuste");
		System.out.println("\n1 --- Gerente --- 10%");
		System.out.println("\n2 --- Vendedor --- 7%");
		System.out.println("\n3 --- Supervisor --- 9%");
		System.out.println("\n4 --- Motorista --- 6%");
		System.out.println("\n5 --- Estoquista --- %5");
		System.out.println("\n6 --- Técnico de TI --- 8%");
		System.out.println("Qual o seu código?");
		codigo = leia.nextInt();

		System.out.println("\nQual o seu nome?");
		nome = leia.next();
		System.out.println("\nQual o seu salário?");
		salario = leia.nextDouble();
		
		switch(codigo) {
		case 1:
			reajuste = 0.10;
			cargo = "Gerente";
			break;
		case 2:
			reajuste = 0.07;
			cargo = "Vendedor";
			break;
		case 3:
			reajuste = 0.09;
			cargo = "Supervisor";
			break;
		case 4: 
			reajuste = 0.06;
			cargo = "Motorista";
			break;
		case 5:
			reajuste = 0.05;
			cargo = "Estoquista";
			break;
		case 6:
			reajuste = 0.6;
			cargo = "Técnico de TI";
		}
		
		salarioTotal = salario + (salario * reajuste);
		System.out.println("\nNome: "+nome);
		System.out.println("\nCargo: "+cargo);
		System.out.printf("\nNovo Salário: R$%.2f ",salarioTotal);
	}

}
