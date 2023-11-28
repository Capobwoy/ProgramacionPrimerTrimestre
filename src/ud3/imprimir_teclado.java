package ud3;

import java.util.Scanner;

public class imprimir_teclado {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in)) {
			int num1,num2;
			System.out.println("Introduce num1 ");
			num1=entrada.nextInt();
			System.out.println("Introduce num2 ");
			num2=entrada.nextInt();
			System.out.println("La suma es:"+(num1+num2));
		}
	}

}
