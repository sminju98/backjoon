package level14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class p7785 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());

		Set<String> set = new HashSet<String>();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String entrance = st.nextToken();

			if (entrance.contains("enter"))
				set.add(name);
			else if (entrance.contains("leave"))
				set.remove(name);
		}
		List<String> list = new ArrayList<String>(set);;
		Collections.sort(list,Collections.reverseOrder());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}
}
