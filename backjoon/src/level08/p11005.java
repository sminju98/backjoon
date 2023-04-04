package level08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p11005 {


	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double N = Double.parseDouble(st.nextToken());
		double new_N=N;
		int B = Integer.parseInt(st.nextToken());
		int count=0;
		
		
		while(new_N/B>=1) {
			new_N/=B;
			count+=1;
			
		}

		for(int i=count;i>=0;i--) {
			if((N/Math.pow(B, i))>=10) {
				System.out.print((char)((N/Math.pow(B, i))-10+'A'));
				
			}
			else {
				
				System.out.print((int)(N/Math.pow(B, i)));
				
				
			}
			N%=Math.pow(B, i);
			
			
		}
		
		
	



	}
}
