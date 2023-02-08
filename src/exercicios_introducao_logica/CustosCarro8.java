package exercicios_introducao_logica;

import java.util.Scanner;

public class CustosCarro8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double carronovo, carrofabrica, percentagemd, impostos;
		
		System.out.println("Qual o custo de fábrica de um carro: ");
		carrofabrica = leia.nextDouble();
		
		percentagemd = carrofabrica * 0.28;
		impostos = carrofabrica * 0.45;
		carronovo =  carrofabrica + percentagemd + impostos;
		
		System.out.printf("O carro custara ao consumidor: R$%.2f ", carronovo);
		
	}

}
