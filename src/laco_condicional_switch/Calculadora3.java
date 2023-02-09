package laco_condicional_switch;

import java.util.Scanner;

public class Calculadora3 {

	public static void main(String[] args) {
		 
		Scanner leia = new Scanner(System.in);
		
		double primeiroNumero, segundoNumero, operacao;
		int codigo = 0;
		
		
		System.out.println("\t\t Tabela de Operações");
		System.out.println("\nCódigo  Operação");
		System.out.println("\n1 --- Soma ");
		System.out.println("\n2 --- Subtração ");
		System.out.println("\n3 --- Multiplicação");
		System.out.println("\n4 --- Divisão");
		System.out.println("Insira o código: ");
		codigo = leia.nextInt();
		
		System.out.println("Insira o primeiro numero: ");
		primeiroNumero = leia.nextDouble();
		System.out.println("Insira o segundo numero: ");
		segundoNumero = leia.nextDouble();
		
		switch(codigo) {
		case 1:
			operacao = primeiroNumero + segundoNumero;
			System.out.printf("%.1f + %.1f = %.1f", primeiroNumero, segundoNumero, operacao);
			break; 
		case 2:
			operacao = primeiroNumero - segundoNumero;
			System.out.printf("%.1f - %.1f = %.1f", primeiroNumero, segundoNumero, operacao);
			break;
		case 3: 
			operacao = primeiroNumero * segundoNumero;
			System.out.printf("%.1f * %.1f = %.1f", primeiroNumero, segundoNumero, operacao);
			break;
		case 4: 
			operacao = primeiroNumero / segundoNumero;
			System.out.printf("%.1f / %.1f = %.1f", primeiroNumero, segundoNumero, operacao);
			break;
		default: 
			System.out.println("Operação Inválida");
		}
		
		leia.close();
		
	}

}
