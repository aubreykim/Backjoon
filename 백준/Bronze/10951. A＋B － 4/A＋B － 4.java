import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String str = "";
		
		while ((str = br.readLine())!=null) {
			StringTokenizer stn = new StringTokenizer(str);
			int a = 0;
			int b = 0;
			while (stn.hasMoreTokens()) {
				a = Integer.parseInt(stn.nextToken());
				b = Integer.parseInt(stn.nextToken());
			}
			System.out.println(a+b);
			
		}

	}
}