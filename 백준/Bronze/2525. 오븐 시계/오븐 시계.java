import java.util.Scanner;

class Main{
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int c = scan.nextInt();
		
		b += c;
		
		while (b >= 60) {
			a++;
			b -= 60;
		}
		if (a >= 24) a -= 24;
		
		System.out.println(a + " " + b);
	}
}