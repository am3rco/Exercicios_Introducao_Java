package lacos_condicionais_if;

import java.util.Scanner;

public class Sangue3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;  
		int idade;
		boolean doacao;
		
		System.out.println("Digite o Nome do doador: ");
		nome = leia.nextLine();
		System.out.println("Digite a idade do doador: ");
		idade = leia.nextInt();
		System.out.println("Primeira doação de sangue (true ou false)?: ");
		doacao = leia.nextBoolean();
		
		if (idade>=18 && idade<=59) {
			System.out.println("" +nome+ " está apto para doar sangue");
		}
		else if (idade<18) {
			System.out.println("" +nome+ " não está apto para doar sangue");
		}
		else if(idade >=60 && idade <=69 && doacao == false) {
			System.out.println("" +nome+ " está apto para doar sangue");
		}
		else {
			System.out.println("" +nome+ " não está apto para doar sangue");
		}
		
		
	}

}
