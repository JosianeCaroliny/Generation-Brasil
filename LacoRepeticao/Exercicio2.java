//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

package LacoRepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int x, n,par=0,impar=0;
		
		for(x=0;x<10;x++)
		{
			Scanner ler = new Scanner(System.in);
			System.out.print("Digite um numero: ");
			n=ler.nextInt();
			if(n%2==0)
				par++;
			else
				impar++;
		}
		System.out.println("Você digitou "+ par +" numeros pares e "+ impar +" numeros impares");
	}
}
