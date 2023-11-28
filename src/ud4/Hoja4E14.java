package ud4;

import java.util.Scanner;

public class Hoja4E14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int TAMANO=4;
		Scanner entrada = new Scanner(System.in);
		int[] bus = new int[TAMANO];
		int res=0;
		int posicion=0;
		boolean numEnc=false;
		for(int i=0;i<TAMANO;i++) {
			System.out.println("Introduce 20 valores");
			bus[i]=entrada.nextInt();
		}
		System.out.println("Introduce la posicion que quieres buscar");
		res=entrada.nextInt();
		do {
			if ((res==bus[posicion])&&(numEnc==false)) {
				System.out.println("La posicion del numero es: " +(i+1));
				numEnc=true;
			}
			posicion++;
		}while ((numEnc=false)&&(posicion<TAMANO));
		
		if (numEnc==false) {
			System.out.println("Numero no encontrado");
		}
		
	
	}

}
