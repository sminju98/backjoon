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

public class p1764 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		Set<String> set = new HashSet<String>();
		List<String> list = new ArrayList<String>();;
		int count =0;

		for (int i = 0; i < N; i++) {
			set.add(br.readLine());
		}	
		
		for (int i = 0; i < M; i++) {
			String name = br.readLine();
			if(set.contains(name)==true) {
				count++;
				list.add(name);
				
			}
		}
		Collections.sort(list);
		System.out.println(count);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}
}
