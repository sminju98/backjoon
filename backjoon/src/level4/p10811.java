package level4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p10811 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n + 1];

		int temp = 0;
		arr[0] = 0;

		for (int t = 0; t <= n; t++) {
			arr[t] = t;
		} // 초기화

		for (int t = 0; t < m; t++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());

			for (int k = 0; k <= (j - i)/2; k++) {
				temp = arr[i + k];
				arr[i + k] = arr[j - k];
				arr[j - k] = temp;
			}

		} // 공 바꾸기

		for (int t = 1; t < n; t++) {
			System.out.print(arr[t]);
			System.out.print(" ");
		}
		System.out.print(arr[n]);
		// 출력

	}
}
