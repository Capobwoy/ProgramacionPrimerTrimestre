package EjerciciosExamen;

import java.util.Scanner;

public class edades {
	static Scanner entrada=new Scanner(System.in);
	static int edad=0;
	public static void main(String[] args) {
		int[] edades=new int[3];
		pedirEdades(edades);
		calculaEdadMedia(edades);
		damePersonasEnEdadDeJubilacion(edades);
		System.out.println("La edad media es "+calculaEdadMedia(edades));
		System.out.println("Hay "+damePersonasEnEdadDeJubilacion(edades)+" en edad de jubilacion");
		System.out.println("hay "+(edades.length- damePersonasEnEdadDeJubilacion(edades))+" en edad laboral");

	}
	public static void pedirEdades(int[]edades) {
		for (int i=0;i<edades.length;i++) {
			System.out.println("Introduce una edad entre 18 y 99");
			edad=entrada.nextInt();
			while ((edad<18)||(edad>99)) {
				System.out.println("No es una edad válida, introducelo de nuevo");
				edad=entrada.nextInt();
			}
			edades[i]=edad;
		}
	}
	public static double calculaEdadMedia(int[]edades) {
		double media=0;
		double acum=0;
		for (int i=0;i<edades.length;i++) {
			acum=acum+edades[i];
		}
		media=acum/edades.length;
		return media;
	}
	public static int damePersonasEnEdadDeJubilacion(int[]edades) {
		int per=0;
		for (int i=0;i<edades.length;i++) {
			if (edades[i]>65) {
				per++;
			}
		}
		return per;
	}

}
