import java.util.Scanner;

//4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
//n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
//�mpar exiba o n�mero elevado ao quadrado.

public class exercicio04 {

	public static void main(String[] args) {
		
		int numero=0, raiz = 0, quad;
		
Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite um numero: ");
		
		numero= leia.nextInt();
		
		if(numero % 2 == 0) {
			
			raiz = (int) Math.sqrt(numero);
			
			System.out.println("\nO numero � par, e sua raiz quadrada � "+raiz);
			
		}else {
			
			quad = numero * numero;
			
			
			System.out.println("\nO numero � impar, e ao quadrada � "+quad);
			
		
		}

	}

}
