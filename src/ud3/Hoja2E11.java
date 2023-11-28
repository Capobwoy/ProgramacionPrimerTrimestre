package ud3;

import java.util.Scanner;

public class Hoja2E11 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in)) {
			int num1;
			int num2;
			num1=0;
			num2=0;
			System.out.println("Introduce el primer número");
			num1=entrada.nextInt();
			System.out.println("Introduce el segundo número");
			num2=entrada.nextInt();
			if (num1=='0' || num2=='0') {
				System.out.println("Carácteres invalidos");
			}
			while (num1<num2) {
				System.out.println(num1);
				num1=num1+1;
			}
			while (num1>=num2) {
				System.out.println(num2);
				num2=num2+1;
			}
		}
	}

}
