package ud3;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		char opcion='0';
		double num1,num2,result=0;
		
		do {
			System.out.println("Menú:");
			System.out.println("Sumar(s)");
			System.out.println("Restar(r)");
			System.out.println("Multiplicar(m)");
			System.out.println("Dividir(d)");
			System.out.println("Salir(a)");
			opcion=entrada.nextLine().charAt(0);
			switch (opcion) {
			case 's':
			case 'S':
				System.out.println("Introduce el primer número:");
				num1=entrada.nextDouble();
				System.out.println("Introduce el segundo número");
				num2=entrada.nextDouble();
				entrada.nextLine();
				result=num1+num2;
				System.out.println("La suma de "+ num1+ " y "+ num2+ " es "+ result);
			break;
			case 'r' :
			case 'R' :
				System.out.println("Introduce el primer número:");
				num1=entrada.nextDouble();
				System.out.println("Introduce el segundo número");
				num2=entrada.nextDouble();
				entrada.nextLine();
				result=num1-num2;
				System.out.println("La resta de "+ num1+ " y "+ num2+ " es "+ result);
			break;
			case 'm' :
			case 'M' :
				System.out.println("Introduce el primer número:");
				num1=entrada.nextDouble();
				System.out.println("Introduce el segundo número");
				num2=entrada.nextDouble();
				entrada.nextLine();
				result=num1*num2;
				System.out.println("La multiplicación de "+ num1+ " x "+ num2+ " es "+ result);
			break;
			case 'd' :
			case 'D' :
				System.out.println("Introduce el primer número:");
				num1=entrada.nextDouble();
				System.out.println("Introduce el segundo número");
				num2=entrada.nextDouble();
				entrada.nextLine();
				result=num1/num2;
				System.out.println("La división de "+ num1+ " / "+ num2+ " es "+ result);
			break;
			default:
				System.out.println("Salir");
			}
		}while ((opcion!='a')&&(opcion!='A'));
	}

}
