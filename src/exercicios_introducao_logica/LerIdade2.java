package exercicios_introducao_logica;

import java.util.Scanner;

public class LerIdade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int ano, mes, dia, diastotais, diasrestantes ;
		
		System.out.println("Quantos dias de vida você tem: ");
		diastotais = leia.nextInt();

		ano = diastotais/365;
		diasrestantes = diastotais % 365;
		mes = diasrestantes / 30;
		dia = diasrestantes % 30;
		
		System.out.printf("Você tem %d anos, %d meses e %d dias de vida",ano, mes, dia);
		
	}

}
