package ud4;

import java.util.Scanner;

public class PalabraAlRevés {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] palabra;
		palabra=new char[4];
		//habilitamos la lectura por teclado
		Scanner entrada=new Scanner(System.in);
		
		//rellenamos el array
		for (int i=0;i<4;i++) {
			System.out.println("Introduce una letra");
			palabra[i]=entrada.nextLine().charAt(0);
		}
		//mostramos la palabra en su orden
		for (int i=0;i<4;i++) {
			System.out.println(palabra[i]);
		}
		System.out.println();
		for (int i=3;i>=0;i--) {
			System.out.println(palabra [i]);
		}
	}

}
