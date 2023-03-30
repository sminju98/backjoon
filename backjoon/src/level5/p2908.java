package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2908 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String num1 = st.nextToken();
		String num2 = st.nextToken();
		
		int A = 1*(num1.charAt(0)-'0')+10*(num1.charAt(1)-'0')+100*(num1.charAt(2)-'0');
		int B = 1*(num2.charAt(0)-'0')+10*(num2.charAt(1)-'0')+100*(num2.charAt(2)-'0');
		if(A>B)System.out.print(A);
		else System.out.print(B);

	}

}
