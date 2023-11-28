package ud3;

import java.util.Scanner;

public class Hoja2E22 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in)) {
			double num;
			double acum;
			acum=0;
			double media;
			media=0;
			int i;
			for (i=1;i<=10;i=i+1) {
				System.out.println("Introduce num ");
				num=entrada.nextInt();
				acum=acum+num;
			}
			media=acum/(i-1);
			System.out.println("La media es "+media);
		}
	}

}
