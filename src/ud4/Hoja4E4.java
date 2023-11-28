package ud4;

public class Hoja4E4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums;
		int num=2;
		nums=new int[50];
		for (int i=0;i<50;i++) {
			nums[i]=num;
			num=num+2;
		}
		for (int i=0;i<50;i++) {
			System.out.println(nums[i]);
		}
	}

}
