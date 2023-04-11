package level12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1463 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count5 = N / 5;
		int count3 = 0;
		
		if(N==3) {
			System.out.println(1);
			return;
		}

		while (count5 * 5 + count3 * 3 != N) {
			while (count5 * 5 + count3 * 3 < N) {
				count3++;
				if (count5 * 5 + count3 * 3 == N) {
					System.out.println(count5 + count3);
					return;
				}
			}
			count5--;
			count3 = 0;
			if (count5 == -1) {
				System.out.println(-1);
				return;
			}


		}
		System.out.println(count5 + count3);
	}

}
