package ud4;

public class EjemploFuncion {
		//función principal. Es la única función
		//que se ejecuta en un programa
		
	public static void main(String[] args) {
		int sum=suma(5,4);
		System.out.println(sum);
	}
		//definimos una función
		//1. Definimos la cabecera
		public static int suma(int a,int b) {
			//2. Cuerpo (todo lo que esté entre
			//+2 llaves
			return a+b;
		}
	
}
