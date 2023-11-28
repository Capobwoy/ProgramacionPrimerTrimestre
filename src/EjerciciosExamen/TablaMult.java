package EjerciciosExamen;

import java.util.Scanner;

public class TablaMult {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int num=0;
		System.out.println("Introduce un número entre 0 y 10");
		num=entrada.nextInt();
		while (esValido(num)==false) {
			System.out.println("El numero no está entre 0 y 10");
			System.out.println("Introducelo de nuevo");
			num=entrada.nextInt();
		}
		if (esValido(num)==true) {
			tablaMult(num);
		}
	}
	public static boolean esValido(int num) {
		if ((num<0)||(num>10)) {
			return false;
		}
		else {
			return true;
		}
	}
	public static void tablaMult(int num) {
		int acum=0;
		for (int i=0;i<=10;i++) {
			acum=num*i;
			System.out.println(num+" x "+i+" = "+acum);
		}
	}
}
