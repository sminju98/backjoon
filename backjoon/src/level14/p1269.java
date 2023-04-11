package level14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class p1269 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		Set<String> set = new HashSet<String>();
		int count =0;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			set.add(st.nextToken());
		}	

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			String name =st.nextToken();
			if(set.contains(name)==true) {
				count++;
				
			}
		}
		System.out.println(N+M-2*count);

	}
}
