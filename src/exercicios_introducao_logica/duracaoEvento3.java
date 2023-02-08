package exercicios_introducao_logica;

import java.util.Scanner;

//3. Faça um programa que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
public class duracaoEvento3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int segundos, horas, restou, minutos, segundo;
		
		System.out.println("Quantos segundos durou o evento: ");
		segundos = leia.nextInt();
		
		horas = segundos / 3600;
		restou = segundos % 3600;
		minutos = (segundos % 3600) / 60 ;
		segundo = restou - (minutos * 60);
		
		System.out.printf("O evento durou %d hora, %d minutos e %d segundos", horas, minutos, segundo);
	}

}
