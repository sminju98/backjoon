package level17;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1010 {

	static int[][]comb;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());

		comb = new int[31][31];
		for(int i=1;i<=30;i++) {
			comb[i][0]=1;
			comb[i][1]=i;
			comb[i][i]=1;
		}
		for(int i=2;i<30;i++) {
			for(int j=2;j<=i;j++) {
				comb[i+1][j]=comb[i][j]+comb[i][j-1];
			}
		}

		for (int test_case = 0; test_case < t; test_case++) {

			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			System.out.println(comb[m][m-n]);
		}
	}
}