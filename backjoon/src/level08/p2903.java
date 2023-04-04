package level08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2903 {


	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int width = 2;

		for(int i=1;i<=N;i++) {
			width = width*2-1;
			
		}
		
		System.out.print((int)Math.pow(width, 2));
		
		
	



	}
}
