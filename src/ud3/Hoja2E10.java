package ud3;

public class Hoja2E10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int acum;
		int cont;
		acum=0;
		cont=0;
		for (i=1;i<=100;i=i+2) {
			acum=acum+i;
			cont=cont+1;
			
		}
		System.out.println("La suma de todos los números impares es: " + acum);
		System.out.println("Hay " + cont + " números impares");
	}

}
