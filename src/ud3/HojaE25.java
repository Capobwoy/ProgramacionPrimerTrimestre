package ud3;

public class HojaE25 {

	public static void main(String[] args) {
		//Declaramos variables
		double sal;
		sal=0;
		double edad;
		edad=0;
		//introducir sueldo y edad
		System.out.println("Introduce sueldo y edad");
		//leemos variables
		edad=3;
		sal=548732;
		//ponemos las condiciones
		if (edad>10) {
			System.out.println("El sueldo es " + (sal*1.1));
		}
		if ((edad<=10)&&(edad>5)) {
			System.out.println("El sueldo es " + (sal*1.07));
		}
		if ((edad<=5)&&(edad>3)) {
			System.out.println("El sueldo es " + (sal*1.05));
		}
		if (edad<=3) {
			System.out.println("El sueldo es " + (sal*1.03));
		}

	}

}
