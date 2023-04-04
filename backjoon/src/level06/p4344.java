package level06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p4344 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int C = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		
	

		for(int t=0;t<C;t++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int[] score = new int[N];
			double average=0;
			int count =0;
			
			for(int i=0;i<N;i++) {
				score[i] = Integer.parseInt(st.nextToken());
				average+=score[i];
				
			}
			
			average/=N;


			for(int i=0;i<N;i++) {
				if(score[i] >average)count+=1;
				
			}
			
			double answer = (double)count/(double)N*100;
			
			System.out.printf("%.3f",answer);
			System.out.printf("%%\n");
			
			

		}

		
	}
}
