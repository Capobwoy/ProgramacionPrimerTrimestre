package ud3;

public class Hoja2E9 {

	public static void main(String[] args) {
		//Declaramos variables
		int num=0;
		int suma=0;
		int contNumPares=0;
		
		while (num<100) {
			num= num+2;
			suma=suma+num;
			contNumPares=contNumPares+1;
			System.out.println("cont: "+num);
		}
		System.out.println("Hay : " + contNumPares+","+suma);
	} 

}
