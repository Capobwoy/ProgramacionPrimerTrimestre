package ud4;

import java.util.Scanner;

public class EjFuncionesYArrays {
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		int[] nums=new int[3];
		System.out.println("direccion de nums"+nums);
		int[] nums2=rellenaArray(nums);
		System.out.println("direccion de nums2"+nums2);
		muestraArray(nums);
		nums[1]=20;
		System.out.println(nums2[1]);
	}
	public static int[] rellenaArray(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			System.out.println("Introduce valor");
			nums[i]=entrada.nextInt();
		}
		return nums;
	}
	public static void muestraArray(int[] nums) {
		for (int i=0;i<nums.length;i++) {
			System.out.println(nums[1]);
		}
	}
}
