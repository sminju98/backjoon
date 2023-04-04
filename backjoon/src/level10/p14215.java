package level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p14215 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int line1 = Integer.parseInt(st.nextToken());
		int line2 = Integer.parseInt(st.nextToken());
		int line3 = Integer.parseInt(st.nextToken());
		
		int max = Math.max(line1, Math.max(line2, line3));
		
		int total = line1+line2+line3;

		if(total<=2*max)
		{
			
			System.out.println(2*(total-max)-1);
			
		}
		
		else {

			System.out.println(total);
		}
				
		
	}

}