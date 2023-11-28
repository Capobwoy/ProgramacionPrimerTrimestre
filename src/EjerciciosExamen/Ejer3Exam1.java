package EjerciciosExamen;

import java.util.Scanner;

public class Ejer3Exam1 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int a=0;
		int b=0;
		int cont=0;
		System.out.println("Introduce un numero");
		a=entrada.nextInt();
		System.out.println("Introduce el siguiente numero");
		b=entrada.nextInt();
		cont=a;
		if ((a<0) || (a>100) || (b<0) || (b>100) || (a==b)) {
			System.out.println("Error");
		}
		else  {
			while (a < b) {
				System.out.println(cont);
				cont=a+1;
				a=a+1;
			}
			while (a >= b) {
				System.out.println(cont);
				cont=a-1;
				a=a-1;
			}
		}
		
		
		
	}

}
