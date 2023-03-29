package level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1001 {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new 
				InputStreamReader(System.in));		
		String str;
		StringTokenizer st = null;
		
		while((str=br.readLine())!=null) {
			st = new StringTokenizer(str);
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			System.out.println(A-B);
			}
	}

}
