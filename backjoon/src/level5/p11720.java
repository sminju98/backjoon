package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11720 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String S = br.readLine();
		int ans = 0;
		for (int i = 0; i < N; i++) {
			ans += S.charAt(i)-'0';

		}
		System.out.print(ans);
	}

}
