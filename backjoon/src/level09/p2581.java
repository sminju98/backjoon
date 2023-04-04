package level09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2581 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		int min = 10000;
		int total = 0;

		for (int i = M; i <= N; i++) {
			boolean check =true;
			if(i==1)check=false;
			for(int j=2;j<i;j++) {
				if(i%j==0) {check=false;
				break;
				}
			}
			if(check==true) {
				total+=i;
				if(min>i)min=i;
			}
			
		}
		if(min==10000)
		{

			System.out.println(-1);
			return;
		}
		
		System.out.println(total);
		System.out.println(min);

	}

}