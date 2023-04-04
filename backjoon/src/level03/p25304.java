package level03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p25304 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long x = Long.parseLong(br.readLine());
		int n = Integer.parseInt(br.readLine());
		long sum=0;
		StringTokenizer st;
		
		for(int i=0;i<n;i++) {
			st= new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sum+=(a*b);
			
		}
		if(x==sum)System.out.print("Yes");
		else System.out.print("No");
	}

}
