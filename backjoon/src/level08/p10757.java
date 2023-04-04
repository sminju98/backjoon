package level08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class p10757 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger bigNumber1 = new BigInteger(st.nextToken());
		BigInteger bigNumber2 = new BigInteger(st.nextToken());

		System.out.println(bigNumber1.add(bigNumber2));
	}
}
