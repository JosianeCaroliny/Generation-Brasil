// Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.

package Introducao;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		int total, anos, meses, dias;
		Scanner calc = new Scanner(System.in);
		System.out.print("Digite sua idade em dias: ");
		
		total=calc.nextInt();
		anos=total/365;
		meses=(total%365)/30;
		dias=total-anos*365-meses*30;
		
		System.out.printf("você tem %d anos,", anos);
		System.out.printf(" %d meses e",meses);
		System.out.printf(" %d dias.", dias);
		}

}
