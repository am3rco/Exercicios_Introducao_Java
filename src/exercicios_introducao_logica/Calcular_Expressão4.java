package exercicios_introducao_logica;

import java.util.Scanner;

import java.lang.Math;

//4. Escreva  um programa que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 

public class Calcular_Expressão4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		double a, b, c, d, r, s;
		
		System.out.println("Insira o valor de a: ");
		a = leia.nextInt();
		System.out.println("\nInsira o valor de b: ");
		b = leia.nextInt();
		System.out.println("\nInsira o valor de c: ");
		c = leia.nextInt();
		
		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);
		d = (r+s) / 2;
		
		System.out.printf("\nO resultado é: %.0f", d);
		
	}

}
