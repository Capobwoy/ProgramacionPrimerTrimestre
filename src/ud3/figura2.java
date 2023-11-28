package ud3;

import java.util.Scanner;

public class figura2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int num=0;
		int i,j;
		char e=' ';
		char c='*';
		System.out.println("Introduce un número");
		num=entrada.nextInt();
		for (i = 0; i < num; i=i-1) {
			for (j = num/2; j < i; j=j+2) {
				System.out.print();
			}
			System.out.println(e);
		}
	}

}
