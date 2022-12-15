import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int copy = n;
		int cycle = 0;
		
		while (true) {
			
			int a = (n/10); // 십의자리
			int b = (n%10); // 일의자리
			int sum = a+b;
			n = (b*10)+(sum%10);
			cycle++;
			
			if(n==copy) break;
			
		}
		System.out.println(cycle);
	}
}