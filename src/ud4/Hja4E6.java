package ud4;

import java.util.Scanner;

public class Hja4E6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double[] numero = new double[10];
		double suma=0, resta=0, mult=1, div=1;
		boolean hayUncero=false;
		for(int i=0;i<10;i++) {
			System.out.println("Introduce 10 valores");
			numero[i]=entrada.nextDouble();
			if (numero[i]==0) {
				hayUncero=true;
			}
		}
		for(int i=0;i<10;i++) {
			suma=suma+numero[i];
			resta=resta-numero[i];
			mult=mult*numero[i];
			if (hayUncero==false) {
				div=div/numero[i];
			}
		}
		System.out.println("La suma es "+suma);
		System.out.println("La resta es "+ resta);
		System.out.println("La multiplicación es " +mult);
		if (hayUncero==false) {
			System.out.println("La división es " +div);
		}else {
			System.out.println("La divsión no se puede realizar");
		}
	}

}
