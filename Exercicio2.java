package aula1;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quantos anos voc� tem?");
		int numero= scanner.nextInt();
		if (numero>30) {
			System.out.println("Vc � velho");
		}
		else if (numero<15) {
				System.out.println("VC � novo");
			}
		
	}
}
//verificar a idade, se for maior que 30 imprimir "Voc� � velho"
		



