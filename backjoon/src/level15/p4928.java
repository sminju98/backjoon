package level15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p4928 {
	static boolean[] isPrime;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if(n==0)return;
			Eratosthenes(2*n+1);
			int count = 0;
			for (int i = n + 1; i <= 2 * n; i++) {
				if (isPrime[i] == true)count++;
			}
			System.out.println(count);
		}
	}

	public static boolean[] Eratosthenes(int number) {
		isPrime = new boolean[number + 1];
		// 소수는 true
		Arrays.fill(isPrime, true);

		// 0, 1은 소수가 아니므로 false
		isPrime[0] = isPrime[1] = false;

		for (int i = 2; i * i <= number; i++) {
			if (isPrime[i]) {
				// i 의 배수들도 소수가 아니므로 false 로 만든다.
				for (int j = i * i; j <= number; j += i) {
					isPrime[j] = false;
				}
			}
		}
		return isPrime;
	}
}
