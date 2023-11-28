package EjerciciosExamen;

import java.util.Scanner;

public class NumCapicua {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int num=0;
		System.out.println("Introduce un numero de 5 cifras");
		num=entrada.nextInt();
		while ((num<10000)||(num>99999)) {
			System.out.println("No es un numero de 5 cifras");
			System.out.println("Introduzca un numero distinto");
			num=entrada.nextInt();
		}
		int u=0,d=0,c=0,m=0,dm=0;
		while (num>=10000) {
			num=num-10000;
			dm++;
		}
		while (num>=1000) {
			num=num-1000;
			m++;
		}
		while (num>=100) {
			num=num-100;
			c++;
		}
		while (num>=10) {
			num=num-10;
			d++;
		}
		u=num;
		if ((u==dm)&&d==m) {
			System.out.println("Es capicua");
		}
		else {
			System.out.println("No es capicua");
		}
	}
	
}
