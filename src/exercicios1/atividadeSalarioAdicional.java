package exercicios1;

import java.util.Scanner;

public class atividadeSalarioAdicional {
	
	public static void main (String[] args) { 
		
		Scanner leia = new Scanner(System.in);
	
		double salariobruto, adicionalnoturno, horasextras, descontos, salarioliquido;
	
		System.out.println("Insira o seu sálario bruto: ");
		salariobruto = leia.nextDouble();
		System.out.println("\nInsira o seu adicional noturno: ");
		adicionalnoturno = leia.nextDouble();
		System.out.println("\nInsira as suas horas extras: ");
		horasextras = leia.nextDouble();
		System.out.println("\nInsira os seus descontos: ");
		descontos = leia.nextDouble();
	
		salarioliquido = salariobruto+adicionalnoturno+(horasextras*5)-descontos;
		System.out.printf("Esse é o seu Salário Líquido: %.2f",salarioliquido);
		
	}
}
