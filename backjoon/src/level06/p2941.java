package level06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2941 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();

		char[] arr = new char[100];

		int answer = word.length();

		for (int i = 0; i < word.length(); i++) {
			arr[i] = word.charAt(i);
		}

		char last;
		char now;
		char after;
		int i = 1;
		while (i < word.length()) {
			last = arr[i - 1];
			now = arr[i];
			if (last == 'c' && now == '=')
				answer -= 1;
			if (last == 'c' && now == '-')
				answer -= 1;
			if (last == 'd' && now == '-')
				answer -= 1;
			if (last == 'l' && now == 'j')
				answer -= 1;
			if (last == 'n' && now == 'j')
				answer -= 1;
			if (last == 's' && now == '=')
				answer -= 1;
			if(i<99) {
				after = arr[i + 1];
				if (last == 'd' && now == 'z' && after == '=') {
					answer -= 2;
					i+=2;
					continue;
			}
			
			} if (last == 'z' && now == '=') {
				answer -= 1;
			}
			i++;

		}
		System.out.println(answer);

	}
}
