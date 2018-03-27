package aula1;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quantos anos você tem?");
		int numero= scanner.nextInt();
		if (numero>30) {
			System.out.println("Vc é velho");
		}
		else if (numero<15) {
				System.out.println("VC é novo");
			}
		
	}
}
//verificar a idade, se for maior que 30 imprimir "Você é velho"
		



