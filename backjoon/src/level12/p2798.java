package level12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2798 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] card = new int[n];
		int total;

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}

		int answer= 0;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				if (i == j)
					continue;
				for (int k = 0; k < n; k++) {
					if (k == i)
						continue;
					if (k == j)
						continue;
					total = card[i]+card[j]+card[k];
					if (m-total < m-answer&&total<=m)
						answer = total;
				}

			}
		}

		System.out.println(answer);
	}
}
