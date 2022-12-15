import java.util.Scanner;

class Main{
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int a = 0;
		int b = 0;
		int[] sum = new int[t];
		
		for (int i = 1; i <= t; i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			sum[i-1] = a+b;
		}

		for (int i = 0; i < sum.length; i++) {
			System.out.println(sum[i]);
		}
		
	}
}
