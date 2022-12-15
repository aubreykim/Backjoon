import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main{
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.valueOf(br.readLine());
		
		for (int i = 1; i <= t; i++) {
			StringTokenizer stn = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(stn.nextToken());
			int b = Integer.parseInt(stn.nextToken());
			bw.write("Case #"+i+": "+a+" + "+b+" = "+(a+b));
			bw.newLine();
		}
		bw.flush();
		
	}
}