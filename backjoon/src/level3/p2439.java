package level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class p2439 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=n-i; j++) {
				{
					System.out.print(" ");
				}
			}
			for (int j = 1; j <=i; j++) {
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
