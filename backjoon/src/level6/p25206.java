package level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p25206 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;

		int N = 20;
		double gpa = 0;
		double total = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			double study = Double.parseDouble(st.nextToken());
			String score = st.nextToken();
			total += study;

			if (score.contentEquals("P")) {
				total -= study;
				continue;
			}

			if (score.contentEquals("A+"))
				gpa = gpa + 4.5 * study;
			if (score.contentEquals("A0"))
				gpa = gpa + 4.0 * study;
			if (score.contentEquals("B+"))
				gpa = gpa + 3.5 * study;
			if (score.contentEquals("B0"))
				gpa = gpa + 3.0 * study;
			if (score.contentEquals("C+"))
				gpa = gpa + 2.5 * study;
			if (score.contentEquals("C0"))
				gpa = gpa + 2.0 * study;
			if (score.contentEquals("D+"))
				gpa = gpa + 1.5 * study;
			if (score.contentEquals("D0"))
				gpa = gpa + 1.0 * study;

		}

		gpa /= total;

		System.out.println(gpa);

	}
}
