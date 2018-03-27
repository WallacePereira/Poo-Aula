package aula1;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] numeros= new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		System.out.println("Pares");
		for (int i=0;i<=14;i++) {
			if (numeros[i]%2==0) {
			System.out.println(numeros[i]);
			}
			//imprimir os numeros pares do vetor
		}
		System.out.println("Impar");
		for (int i=0;i<=14;i++) {
			if (numeros[i]%2!=0) {
			System.out.println(numeros[i]);
			}
			//imprimir os numeros Impar do vetor
		}
	}
}
