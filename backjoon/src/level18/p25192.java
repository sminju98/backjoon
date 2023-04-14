package level18;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p25192 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		
		if(t==1) {
			
			int n =Integer.parseInt(br.readLine());
			System.out.print(n*n);
			return;
			
		}
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int[] num = new int[t];
		int max = 2;
		int min =1000000;

		for (int i=0;i<t;i++) {
			num[i]=Integer.parseInt(st.nextToken());
			if(min>num[i])min=num[i];
			if(max<num[i])max=num[i];
		}
		System.out.print(min*max);
	

	}
}