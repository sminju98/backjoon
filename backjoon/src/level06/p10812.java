package level06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class p10812 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<Integer>();


		for (int t = 0; t <= n; t++) {
            list.add(t);
		} // 초기화

		for (int t = 0; t < m; t++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
            int start = list.get(i);
            int end = list.get(k);

            while(start != end) {
                list.remove(i);
                list.add(j, start);
                start = list.get(i);
            }
		} // 공 바꾸기

		for (int t = 1; t < n; t++) {
			System.out.print(list.get(t));
			System.out.print(" ");
		}
		System.out.print(list.get(n));
		// 출력

	}
}
