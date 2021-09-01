import java.util.Scanner;

//1- Faça um programa que receba três inteiros e diga qual deles é o maior.
public class exercicio01 {

	public static void main(String[] args) {
		
float numero1,numero2,numero3;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite o Primeiro numero: ");
		numero1 = leia.nextFloat();
		System.out.println("\nDigite o segundo numero: ");
		numero2 = leia.nextFloat();
		System.out.println("\nDigite o terceiro numero: ");
		numero3 = leia.nextFloat();
		
		if(numero1>numero2 && numero1>numero3) {
			
		System.out.println("\nO maior numero é o primeiro: "+numero1);

			}else if(numero2>numero1 && numero2>numero3) {
	
				System.out.println("\nO maior numero é o segundo: "+numero2);
			}else {
				System.out.println("\nO maior numero é o terceiro: "+numero3);
			}


	}
}
