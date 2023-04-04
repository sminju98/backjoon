package level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2745 {


	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String N = st.nextToken();
		int B = Integer.parseInt(st.nextToken());
		int answer=0;
		
		
		for(int i=0;i<N.length();i++) {
			if('A'<=N.charAt(i)&&N.charAt(i)<='Z')
			answer+=(N.charAt(i)-'A'+10)*(Math.pow(B, N.length()-i-1));
			else
				answer+=(N.charAt(i)-'0')*(Math.pow(B, N.length()-i-1));
			
		}
		
		System.out.println(answer);



	}
}
