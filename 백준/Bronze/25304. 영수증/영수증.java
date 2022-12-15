import java.util.Scanner;

class Main{
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int n = scan.nextInt();
		int sum = 0;
		String bl = "";
		
		for (int i = 1; i <= n; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			sum += a*b;
		}
		if (sum == x) {
			bl = "Yes";
		} else {
			bl = "No";
		}
		System.out.println(bl);
	}
}