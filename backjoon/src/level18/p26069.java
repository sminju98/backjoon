package level18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class p26069 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		HashSet<String> set = new HashSet<>();
		set.add("ChongChong");
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			String a = st.nextToken();
			String b = st.nextToken();
			if(set.contains(a))set.add(b);
			else if(set.contains(b))set.add(a);

		}

		System.out.print(set.size());
	}
}