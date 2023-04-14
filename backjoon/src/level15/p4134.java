package level15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class p4134 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		for (int testcase = 0; testcase < t; testcase++) {

			BigInteger N = new BigInteger(br.readLine());
			if(N.longValue()==0||N.longValue()==1) {
				System.out.println(N.nextProbablePrime());
			}
			else if (IsPrimeNumber(N.longValue()) == true) {
				System.out.println(N);
			} else {
				System.out.println(N.nextProbablePrime());

			}
		}
	}

	public static boolean IsPrimeNumber(long n) {
		// 2 부터 number 까지 전체 순회
		long sqrt = (long) Math.sqrt(n);
		for (int i = 2; i <= sqrt; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}