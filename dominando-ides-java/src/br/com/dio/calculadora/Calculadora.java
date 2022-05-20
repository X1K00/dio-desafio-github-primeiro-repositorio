package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = input.nextDouble();
		System.out.println("Digite o segundo valor: ");
		b = input.nextDouble();
		
		double soma = soma(a,b);
		double subtracao = subtracao(a,b);
		double divisao = divisao(a,b);
		double multiplicacao = multiplicacao(a,b);
		
		System.out.printf("soma %.0f\n",soma);
		System.out.printf("subtracao %.0f\n",subtracao);
		System.out.printf("divisao %.1f\n",divisao);
		System.out.printf("multiplicacao %.0f\n",multiplicacao);
		
	}
	
	public static double soma(double a, double b) {
		return a+b;
	}
	public static double subtracao(double a, double b) {
		return a-b;
	}
	public static double divisao(double a, double b) {
		return a/b;
	}
	public static double multiplicacao(double a, double b) {
		return a*b;
	}

}
