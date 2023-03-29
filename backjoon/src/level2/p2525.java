package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2525 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new 
				InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken());
		
		
		if(b+c<60){
			System.out.printf("%d %d",a,b+c);			
		}
		else {
			int h,m;
			h=(a+((b+c)/60))%24;
			m=(b+c)%60;
			System.out.printf("%d %d",h,m);			
		}
	}

}