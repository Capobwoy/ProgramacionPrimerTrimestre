package ud3;

import java.util.Scanner;

public class Figura1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int num=0;
		int i,j;
		char c='*';
		System.out.println("Introduce un número");
		num=entrada.nextInt();
		for (i = 0; i < num; i++) {
			for (j = 0; j < i; j++) {
				System.out.print(c);
			}
			System.out.println(c);
		}
	}

}
