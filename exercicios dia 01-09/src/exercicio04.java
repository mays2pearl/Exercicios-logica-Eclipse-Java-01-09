import java.util.Scanner;

//4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
//ímpar exiba o número elevado ao quadrado.

public class exercicio04 {

	public static void main(String[] args) {
		
		int numero=0, raiz = 0, quad;
		
Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite um numero: ");
		
		numero= leia.nextInt();
		
		if(numero % 2 == 0) {
			
			raiz = (int) Math.sqrt(numero);
			
			System.out.println("\nO numero é par, e sua raiz quadrada é "+raiz);
			
		}else {
			
			quad = numero * numero;
			
			
			System.out.println("\nO numero é impar, e ao quadrada é "+quad);
			
		
		}

	}

}
