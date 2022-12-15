import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



class Main{
	
	public static void main(String args[]) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int[] sum = new int[t];
		
		for (int i = 0; i< t; i++) {
			StringTokenizer stn = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(stn.nextToken());
			int b = Integer.parseInt(stn.nextToken());
			sum[i] = a+b;
			System.out.println("Case #"+(i+1)+": "+ sum[i]);
		}
	}
}
