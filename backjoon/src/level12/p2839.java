package level12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2839 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count =0;
		int num =665;

		while (count != N) {
			num++;

			// int형인 num을 String으로 변환한 뒤, "666"이란 문자열이 있는지 검사
			if (String.valueOf(num).contains("666")) {
				count++;
			}
		}
		System.out.println(num);
	}
}
