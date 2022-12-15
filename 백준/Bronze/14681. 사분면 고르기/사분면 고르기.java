import java.util.Scanner;

class Main{
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		int n = 0;
		if (x>0 && y>0) {
			n = 1;
		} else if (x<0 && y>0) {
			n = 2;
		} else if (x<0 && y<0) {
			n = 3;
		} else if (x>0 && y<0) {
			n = 4;
		}
		System.out.println(n);
	}
}
