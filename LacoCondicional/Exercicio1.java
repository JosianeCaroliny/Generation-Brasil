//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

package LacoCondicional;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int n1,n2,n3;
		System.out.print("Digite 3 numeros: ");
		n1=ler.nextInt();
		n2=ler.nextInt();
		n3=ler.nextInt();
		
		if(n1>n2 && n1>n3)
		{
			System.out.println("O primeiro n�mero � o maior");
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println("O segundo n�mero � o maior");
		}
		else
		{
			System.out.println("O terceiro � o maior");
		}
	}
	
}
