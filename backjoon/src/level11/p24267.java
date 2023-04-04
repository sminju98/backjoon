package level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p24267 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());
        int n = n0;
        int answer = 1;

        int fn = a1 * n + a0;
        int gn = c * n;

        if (a1 - c != 0) {
            int k = -a0 / (a1 - c);
            if (n < k) {
                answer = 0;
            }
        }
        
        if (fn > gn) {
            answer = 0;
        }

        System.out.println(answer);
	}
}
