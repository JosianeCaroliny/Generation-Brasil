/*Crie um programa que leia um n?mero do teclado at? que encontre um n?mero igual a zero. 
No final, mostre a soma dos n?meros digitados.(DO...WHILE)*/

package LacoRepeticao;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		int n,soma=0;
		
		do {
			Scanner cal = new Scanner(System.in);
			System.out.print("Digite um n?mero: ");
			n=cal.nextInt();
			soma+=n;
		}while(n!=0);
		System.out.println("A soma dos n?meros digitados ? "+soma);
	}

}
