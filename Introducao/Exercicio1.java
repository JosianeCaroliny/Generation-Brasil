//Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.

package Introducao;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main (String args [])
	{
		Scanner ler = new Scanner(System.in); 		
		int anos, meses, dias, resp;
		System.out.println("Quantos anos voc� tem?: ");
		anos=ler.nextInt();
		
		System.out.println("Quantos meses voc� tem?: ");
		meses=ler.nextInt();
		
		System.out.println("Quantos dias voc� tem?: ");
		dias=ler.nextInt();
		
		resp=anos*365+meses*30+dias;
		
		System.out.printf("Sua idade em dias � de: %d", resp);
	}

}
