package level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p9063 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());


		StringTokenizer st;
		int[] x = new int[n];
		int[]y = new int[n];


		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());

		}
		
		Arrays.sort(x);
		Arrays.sort(y);

		System.out.println((x[n-1]-x[0])*(y[n-1]-y[0]));

	}

}