//2- Faça um programa que entre com três números e coloque em ordem crescente.

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		int numero1,numero2,numero3,ordem;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite o Primeiro numero: ");
		numero1 = leia.nextInt();
		System.out.println("\nDigite o segundo numero: ");
		numero2 = leia.nextInt();
		System.out.println("\nDigite o terceiro numero: ");
		numero3 = leia.nextInt();
		
		if(numero2 > numero1){
	        ordem = numero1;
	        numero1 = numero2;
	        numero2 = ordem;
	    } if(numero3 > numero1){
	        ordem = numero1;
	        numero1 = numero3;
	        numero3 = ordem;
	    } if(numero3 > numero2){
	        ordem = numero2;
	        numero2 = numero3;
	        numero3 = ordem;
	    }
	    System.out.println("\n"+numero3+"-"+numero2+"-"+numero1);	
			}
		
			
	}


