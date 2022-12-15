import java.util.Scanner;

class Main{
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		String str = Integer.toString(b);
		System.out.println(a*Character.getNumericValue(str.charAt(2)));
		System.out.println(a*Character.getNumericValue(str.charAt(1)));
		System.out.println(a*Character.getNumericValue(str.charAt(0)));
		System.out.println(a*b);
		
	}
}