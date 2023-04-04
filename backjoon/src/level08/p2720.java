package level08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2720 {


	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int testcase=0;testcase<T;testcase++) {

			int C = Integer.parseInt(br.readLine());
			int[] money = new int[4];
			
			while(C>=25) {
				C-=25;
				money[0]+=1;
			}

			while(C>=10) {
				C-=10;
				money[1]+=1;
			}
			while(C>=5) {
				C-=5;
				money[2]+=1;
			}
			while(C>=1) {
				C-=1;
				money[3]+=1;
			}
			System.out.printf("%d %d %d %d\n",money[0],money[1],money[2],money[3]);
			
			
		}
	



	}
}
