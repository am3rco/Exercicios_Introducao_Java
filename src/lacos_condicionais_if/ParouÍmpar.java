package lacos_condicionais_if;

import java.util.Scanner;

public class ParouÍmpar {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int number;
		
		System.out.println("Insira um numero inteiro: ");
		number = leia.nextInt();
		
	    if (number % 2 == 0) {
	      if (number >= 0) {
	        System.out.println("O número é par e positivo");
	      } else {
	        System.out.println("O número é par e negativo");
	      }
		} else {
	    	if(number >=0 ) {
	    		System.out.println("O número é ímpar e positivo");
	        } else {
	          System.out.println("O número é ímpar e negativo");
	    	}
	    }
		
	}

}
