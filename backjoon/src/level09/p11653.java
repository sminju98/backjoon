package level09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p11653 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		for (int i = 2; i <= N; i++) {
			if (N == 1)
				return;
			if (N % i == 0) {
				System.out.println(i);
				N /= i;
				i--;
			}

		}
		if(N==1)return;
		System.out.println(N);

	}

}