package ud3;

import java.util.Scanner;

public class trampa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in); {
	     System.out.print("Ingrese la altura del árbol: ");
	     int altura = scanner.nextInt();
	     for (int i = 1; i <= altura; i++) {
	    	 // Dibuja espacios en blanco a la izquierda
	    	 for (int j = 1; j <= altura - i; j++) {
	    		 System.out.print(" ");
	         	}
	            // Dibuja asteriscos en el centro
	            for (int k = 1; k <= i * 2 - 1; k++) {
	                System.out.print("*");
	            }
	            
	            System.out.println();
	        }
		 }
	}

}
