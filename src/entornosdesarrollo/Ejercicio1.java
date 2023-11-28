package entornosdesarrollo;

public class Ejercicio1 {

	public static void main(String[] args) {
		int n =5;
		int sum=0;
		for (int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println("La suma de los números del 1 al "+n+" es: "+sum);
	}

}

//n pasa a tener el valor 5 y sum 0
//entra en el bucle y el contador se inicia en 1 e irá hasta
//el valor de n(5) incrementandose de 1 en 1
//mientras eso suceda sum irá acumulando la suma de i en
//cada ciclo
