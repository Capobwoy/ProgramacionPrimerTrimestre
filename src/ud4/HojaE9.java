package ud4;

import java.util.Scanner;

public class HojaE9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] uno = new int[5];
		int[] dos = new int[5];
		for(int i=0;i<5;i++) {
			System.out.println("Introduce 5 valores");
			uno[i]=entrada.nextInt();
		}
		for(int i=0;i<5;i++) {
			dos[i]=uno[i]*2;
			System.out.println(dos[i]);
		}
	}

}
