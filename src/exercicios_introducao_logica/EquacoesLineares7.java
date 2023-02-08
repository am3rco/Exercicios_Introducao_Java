package exercicios_introducao_logica;

import java.util.Scanner;

public class EquacoesLineares7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double a, b, c, d, e, f, x, y;
		
		System.out.println("Insira o valor de a: ");
		a = leia.nextDouble();
		System.out.println("\nInsira o valor de b: ");
		b = leia.nextDouble();
		System.out.println("\nInsira o valor de c: ");
		c = leia.nextDouble();
		System.out.println("\nInsira o valor de d: ");
		d = leia.nextDouble();
		System.out.println("\nInsira o valor de e: ");
		e = leia.nextDouble();
		System.out.println("\nInsira o valor de f: ");
		f = leia.nextDouble();

		x = (c*e-b*f) / (a*e - b*d);
		y = (a*f - c*d) / (a*e - b*d);
		
		System.out.printf("\nOs valores de x e y são respectivamente: %.2f e %.2f", x, y );
	}

}
