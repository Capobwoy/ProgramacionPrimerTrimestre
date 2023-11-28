package ud4;

import java.util.Scanner;

public class Hoja5E2y4 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int cua=cuadrado();
		System.out.println(cua);
		int med=media(10,25);
		System.out.println(med);
	}
	public static int cuadrado(int a) {
		return a*a;
	}
	public static int media(int a,int b) {
		return (a+b)/2;
	}
}
