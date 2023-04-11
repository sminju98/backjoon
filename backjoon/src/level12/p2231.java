package level12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2231 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());

		for (int i = 0; i < N; i++) {

			String temp = Integer.toString(i);
			int sum = 0;

			for (int j = 0; j < temp.length(); j++) {
				sum += Character.getNumericValue(temp.charAt(j));
			}
			sum += Integer.parseInt(temp);

			if (sum == N) {
				System.out.println(temp);
				break;
			} else if (i == N) {
				System.out.println(0);
			}

		}
	}
}
