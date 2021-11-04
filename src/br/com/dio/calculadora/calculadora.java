package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o 1° Valor: ");
		a = scan.nextInt();
		System.out.println("Digite o 2° Valor: ");
		b = scan.nextInt();
		
		int soma = soma (a,b);
		int subtritacao = subtritacao  (a,b);
		int multiplicacao = multiplicacao (a,b);
		int divisao = divisao (a,b);
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtritacao: " + subtritacao);
		System.out.println("Multiplicacao: " + multiplicacao);
		System.out.println("Divisao: " + divisao);
		
	}
	
	public static int soma (int a, int b) {
		return a + b;
	}
	
	public static int subtritacao (int a, int b) {
		return a - b;
	}
	
	public static int multiplicacao (int a, int b) {
		return a * b;
	}
	
	public static int divisao (int a, int b) {
		return a / b;
	}
	


}
