package level17;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class p11050 {
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i=0;i<T;i++) {
		st = new StringTokenizer(br.readLine(), " ");
		
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
 
		System.out.println(BC(N, K));
		}
	}
	
	static int BC(int n, int k) {
		
		// 2번 성질
		if(n == k || k == 0) {
			return 1;
		}
 
	    // 1번 성질
		return BC(n - 1, k - 1) + BC(n - 1, k);
	}
}