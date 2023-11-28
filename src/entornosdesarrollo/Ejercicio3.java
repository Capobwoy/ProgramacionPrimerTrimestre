package entornosdesarrollo;

public class Ejercicio3 {

	public static void main(String[] args) {
		int n=10;
		int a=0;
		int b=1;
		System.out.println(a+" ,"+b);
		for (int i=2;i<n;i++) {
			int temp=a+b;
			System.out.println(", "+temp);
			a=b;
			b=temp;
		}
	}

}
