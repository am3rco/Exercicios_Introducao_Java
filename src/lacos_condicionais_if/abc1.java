package lacos_condicionais_if;

import java.util.Scanner;

public class abc1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, c, soma;
		
		System.out.println("Insira o valor de a: ");
		a = leia.nextInt();
		System.out.println("\nInsira o valor de b: ");
		b = leia.nextInt();
		System.out.println("\nInsira o valor de c: ");
		c = leia.nextInt();
		
		soma = a+b;
		
		
		if(soma>c) {
			System.out.printf("%d + %d = %d > %d ",a,b,soma,c);
			System.out.println("\nA Soma de A + B é Maior do que C");
		}
		else if(soma<c){
			System.out.printf("%d + %d = %d < %d ",a,b,soma,c);
			System.out.println("\nA Soma de A + B é Menor do que C");
		}
		else if(soma==c) {
			System.out.printf("%d + %d = %d = %d ",a,b,soma,c);
			System.out.println("\nA Soma de A + B é igual a C");
		}
	}

}
