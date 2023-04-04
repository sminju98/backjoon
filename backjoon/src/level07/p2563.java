package level07;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p2563 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;

		boolean[][] arr = new boolean[101][101];
		int count =0;

		for (int i = 1; i <=N; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for (int j = x; j <x+10; j++) {
				for (int k = y;k <y+10; k++) {
					if(arr[j][k]==true) {continue;}
					arr[j][k]=true;
					count++;
				}
			}
		}System.out.print(count);
		
		




	}
}