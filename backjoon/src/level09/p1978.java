package level09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1978 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] num = new int[100];
		int count = 0;

		for (int i = 0; i < N; i++) {

			boolean check =true;
			num[i] = Integer.parseInt(st.nextToken());
			if(num[i]==1)check=false;
			for(int j=2;j<num[i];j++) {
				if(num[i]%j==0) {check=false;
				break;
				}
			}
			if(check==true)count++;
		}
		System.out.print(count);

	}

}