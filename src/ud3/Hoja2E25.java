package ud3;

public class Hoja2E25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=0;
		int c=0;
		int cont=0;
		a=0;
		b=1;
		cont=1;
		while (cont<=25) {
			System.out.println(a);
			c=(a + b);
			a=b;
			b=c;
			cont=(cont + 1);
		}

	}

}
