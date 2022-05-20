package br.com.dio;

import java.util.Scanner;

import br.com.dio.model.Gato;
public class PrimeiroPrograma {

	public static void main(String[] args) {
		Gato gato = new Gato("Xanin", "Azul", 12);
		Livro livro = new Livro();
		
		/*Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor para A: ");
		int a = input.nextInt();
		System.out.print("Digite um valor para B: ");
		int b = input.nextInt();
		System.out.printf("a soma de A + B = %s", a+b);
		}*/
	}	

}
class Livro{
	private String nome;
	private String npag;
}
