package level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p1316 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 0;

		for (int t = 0; t < N; t++) {

			boolean[] check = new boolean[26];
			Arrays.fill(check, false);
			String word = br.readLine();
			boolean group = true;
			
			check[(int) (word.charAt(0) - 'a')] = true;
			
			for (int i = 1; i < word.length(); i++) {
				
				if (check[(int) (word.charAt(i) - 'a')] == true) {
					if(word.charAt(i)!=word.charAt(i-1)) {
						group=false;
						break;}
					else;
					}
			
				check[(int) (word.charAt(i) - 'a')] = true;

			}
			if (group == true)
				count += 1;
		}
		System.out.print(count);

	}
}
