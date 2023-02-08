package exercicios_introducao_logica;

import java.util.Scanner;

//1. Faça um programa que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.
public class LerIdade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int ano, mes, dia, diastotais ;
		
		System.out.println("Quantos anos você tem: ");
		ano = leia.nextInt();
		System.out.println("\nQuantos meses você tem: ");
		mes = leia.nextInt();
		System.out.println("\nQuantos dias você tem: ");
		dia = leia.nextInt();
		
		diastotais = dia + (ano * 365) + (mes * 30);
		
		System.out.printf("\nVocê possui %d dias de vide", diastotais);
	}

}
