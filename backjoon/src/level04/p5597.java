package level04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p5597 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[31];
		Arrays.fill(arr, 0);
		arr[0]=1;
		
		for (int i = 0; i <28; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[num]=1;
		}//출석체크

		for (int i = 1; i <=30; i++) {
			if(arr[i]==0)System.out.println(i);
		}
		//출력

	}
}
