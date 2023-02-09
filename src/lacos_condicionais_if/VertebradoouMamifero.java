package lacos_condicionais_if;

import java.util.Scanner;

public class VertebradoouMamifero {

	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	int resposta;
	
	System.out.println("Digite 1 ou 2 para selecionar");
	System.out.println("Vertebrado (1) ou Invertebrado (2)?");
	resposta = leia.nextInt();
	
	if(resposta == 1) {
		System.out.println("Ave (1) Mamifero (2)");
		resposta = leia.nextInt();
		if (resposta == 1) {
			System.out.println("Carnivoro (1) Ornivoro (2)");
			resposta = leia.nextInt();
			if (resposta == 1) {
				System.out.println("Aguia");
			} else {
				System.out.println("Pombo");
			}
		} else {
			System.out.println("Onívoro (1) ou Herbiviro (2)");
			resposta = leia.nextInt();
			if (resposta == 1) {
				System.out.println("Humano");
			} else {
				System.out.println("Vaca");
			}
		}
	} else {
		System.out.println("Inseto (1) ou Anelideo (2)");
		resposta = leia.nextInt();
		if (resposta == 1) {
			System.out.println("Hematófogo (1) ou Herbivoro (2)");
			resposta = leia.nextInt();
			if (resposta == 1) {
				System.out.println("Pulga");
			} else {
				System.out.println("Lagarta");
			}
		} else {
			System.out.println("Hematófago (1) ou Onívoro (2)");
			resposta = leia.nextInt();
			if (resposta == 1) {
				System.out.println("Sanguessuga");
			} else {
				System.out.println("Minhoca");
			}
		}
	}
					
	}
}