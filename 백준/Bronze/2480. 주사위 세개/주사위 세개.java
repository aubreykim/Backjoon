import java.util.Scanner;

class Main{
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int sum = 0;
		
		if (a==b&&b==c) {
			sum = 10000+a*1000;
		} else if ((a==b && a!=c)||(a!=b && a==c)) {
			sum = 1000+a*100;
		} else if ((a!=b && b==c)) {
			sum = 1000+b*100;
		} else if (a!=b && a!=c && b!=c) {
			int max = 0;
			if (a>b && a>c) {
				max = a;
			} else if (a>b && a<c) {
				max = c;
			} else if (a<b && a>c) {
				max = b;
			} else if (a<b && a<c && b>c) {
				max = b;
			} else if (a<b && a<c && b<c) {
				max = c;
			}
			sum=100*max;
		}
		System.out.println(sum);
		
	}
}