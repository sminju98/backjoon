package level13;

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

public class p18870 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		StringTokenizer st;
		List<Integer> list = new ArrayList<>();

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			list.add(Integer.parseInt(st.nextToken()));

		}

		Set<Integer> set = new HashSet<Integer>(list);
		List<Integer> new_list = new ArrayList<Integer>(set);

		Collections.sort(new_list);

        int index = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : new_list) {
            if (!map.containsKey(x)) {
                map.put(x, index);
                index++;
            }
        }
        for (int x : list) {
            sb.append(map.get(x) + " ");
        }
        System.out.println(sb);
	}

}
