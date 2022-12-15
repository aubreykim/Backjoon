import java.util.Scanner;

class Main{
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();
		
		int setAlarm = 0;
		if (m >= 45) {
			m -= 45;
		} else {
			int temp = Math.abs(m-45);
			m = 60-temp;
			h--;
			if (h<0) {
				h += 24;
			}
		}
		System.out.println(h);
		System.out.println(m);
	}
}
