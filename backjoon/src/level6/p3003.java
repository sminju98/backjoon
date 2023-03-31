package level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p3003 {

	public static void main(String args[]) throws IOException {
		final int[] chess = {1,1,2,2,2,8};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<5;i++) {
			System.out.print(chess[i]-Integer.parseInt(st.nextToken()));
			System.out.print(" ");
		}
		System.out.print(chess[5]-Integer.parseInt(st.nextToken()));
		
		
	}
}
