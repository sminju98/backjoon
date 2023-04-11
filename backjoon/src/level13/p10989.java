package level13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class p10989 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		int arr[] = new int[10001];
		Arrays.fill(arr, 0);

		for (int i = 0; i < N; i++) {
			arr[Integer.parseInt(br.readLine())] += 1;

		}

		for (int i = 0; i < 10001; i++) {
			while (arr[i] >= 1) {
				arr[i]--;
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}

}
