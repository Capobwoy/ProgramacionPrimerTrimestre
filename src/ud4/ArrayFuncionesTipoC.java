package ud4;

import java.util.Scanner;

public class ArrayFuncionesTipoC {
	static Scanner entrada=new Scanner(System.in);
	
	public static void main(String[] args) {
	double[] nums=new double[5];
	rellenaArray(nums);
	double results=sumarElementos(nums);
	System.out.println("La suma es "+results);
	double resultr=restarElementos(nums);
	System.out.println("La resta es "+resultr);
	double resultm=multElementos(nums);
	System.out.println("La multiplicacion es "+resultm);
	double resultd=dividirElementos(nums);
	System.out.println("La division es "+resultd);
	double resultp=promedioElementos(nums);
	System.out.println("El promedio es "+resultp);
	double resultmax=maxElementos(nums);
	System.out.println("El máximo de la array es "+resultmax);
	double resultmin=minElementos(nums);
	System.out.println("El mínimo de la array es "+resultmin);
	sumaAcum(nums);
	ArrayInvertida(acum);
	}
	
	public static void rellenaArray(double[] nums) {
		for(int i=0;i<nums.length;i++) {
			System.out.println("Introduce valor");
			nums[i]=entrada.nextInt();
		}
		return;
	}
	public static double sumarElementos(double[] nums) {
		double suma=0;
		for(int i=0;i<nums.length;i++) {
			suma=suma+nums[i];
		}
		return suma;
	}
	public static double restarElementos(double[] nums) {
		double resta=0;
		for(int i=0;i<nums.length;i++) {
			resta=resta-nums[i];
		}
		return resta;
	}
	public static double multElementos(double[] nums) {
		double mult=1;
		for(int i=0;i<nums.length;i++) {
			mult=mult*nums[i];
		}
		return mult;
	}
	public static double dividirElementos(double[] nums) {
		double div=1;
		for(int i=0;i<nums.length;i++) {
			div=nums[i]/div;
		}
		return div;
	}
	public static double promedioElementos(double[] nums) {
		double prom=sumarElementos(nums)/nums.length;
		return prom;
	}
	public static double maxElementos(double[] nums) {
		double max=nums[0];
		for(int i=1;i<nums.length;i++) {
			if (nums[i]>max) {
				max=nums[i];
			}
		}
		return max;
	}
	public static double minElementos(double[] nums) {
		double min=nums[0];
		for(int i=1;i<nums.length;i++) {
			if (nums[i]<min) {
				min=nums[i];
			}
		}
		return min;
	}
	public static double[] sumaAcum(double[] nums) {
		double[] acum=new double[5];
		double sumacum=0;
		for(int i=0;i<acum.length;i++) {
			acum[i]=nums[i]+sumacum;
		}
		return nums;
	}
	public static double ArrayInvertida(double[] nums) {
		double[] numsinv=new double[5];
		for (int i=numsinv.length;i>=0;i--) {
			numsinv[i]=nums[i];
		}
		return numsinv[4];
	}
	

}
