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

public class p1620 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		HashMap<String, Integer> map2 = new HashMap<String, Integer>();
		
		for (int i = 1; i <= N; i++) {
			String name =br.readLine().trim();
			map.put(i, name);
			map2.put(name, i);
		}


		for (int i = 0; i < M; i++) {
			String s = br.readLine().trim();
			
			
			 try {
				 Integer.parseInt(s);
				 System.out.println(map.get(Integer.parseInt(s)));
			    } catch (NumberFormatException ex) {
			    	System.out.println(map2.get(s));
			  }
			
		}

	}
}
