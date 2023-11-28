package ud4;

import java.util.Scanner;

public class Hoja5E23 {
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		int[] num;
		int tam=0;
		System.out.println("Introduce el tamaño de la array");
		tam=entrada.nextInt();
		num=new int[tam];
		rellenaArray(num);
		int[] num2=new int[tam];
		
		muestraArray(num);
	}
	public static void rellenaArray(int[] num) {
		for (int i=0;i<num.length;i++) {
			System.out.println("Introduce valor");
			num[i]=entrada.nextInt();
		}
		return ;
	public static void copiaArray(int[] num2) {
		for (int i=0)
	}
	}
	public static void muestraArray(int[] num) {
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]+",");
		}
		return;
	}
}
