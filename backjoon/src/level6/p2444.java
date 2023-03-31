package level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2444 {

	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
				
				
		for(int i=1;i<=size;i++) {
			System.out.println(" ".repeat(size-i)+"*".repeat(2*i-1));
			
		}
		
		for(int i=size-1;i>=1;i--) {
			System.out.println(" ".repeat(size-i)+"*".repeat(2*i-1));
			
		}
	}
}
