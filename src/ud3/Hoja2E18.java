package ud3;

public class Hoja2E18 {

	public static void main(String[] args) {
		//declaramos variables
		int cont=0;
		int acum=0;
		int mul=0;
		while (cont<= 10) {
			while (acum<= 10) {
				mul=cont*acum;
				System.out.println(cont + "x" + acum + "=" + mul);
				acum=acum+1;
			}
			cont=cont+1;
			acum=0;
		}

	}

}
