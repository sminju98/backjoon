package level09;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class p9506 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			List<Integer> list = new ArrayList<Integer>();
			int N = Integer.parseInt(br.readLine());
			if (N == -1)
				return;
			int cnt = 0;
			for (int i = 1; i < N; i++) {
				if (N % i == 0) {
					list.add(i);
					cnt += i;
				}
			}
			if (cnt == N) {
				System.out.printf("%d = ", N);
				for (int i = 0; i < list.size() - 1; i++) {

					System.out.printf("%d + ", list.get(i));
				}

				System.out.println(list.get(list.size() - 1));

			} else {
				System.out.printf("%d is NOT perfect.\n", N);

			}

		}

	}

}