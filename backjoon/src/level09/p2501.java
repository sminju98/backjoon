package level09;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2501 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int count = 0;

		for (int i = 1; i <= N; i++) {
			if (N % i == 0)
				count++;

			if (count == K) {
				System.out.print(i);
				return;
			}

		}

		System.out.print(0);

		return;

	}

}