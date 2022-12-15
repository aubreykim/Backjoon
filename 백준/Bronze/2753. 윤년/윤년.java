import java.util.Scanner;

class Main{
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		int num = 0;
		if (year%4==0 && year%100!=0 || year%400==0) {
			num = 1;
		} else {
			num = 0;
		}
		System.out.println(num);
	}
}