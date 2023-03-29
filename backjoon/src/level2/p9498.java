package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p9498 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new 
				InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int y = Integer.parseInt(st.nextToken());
		
		if(x>0&&y>0){
			System.out.print(1);			
		}
		else if(x<0&&y>0){
			System.out.print(2);			
		}
		else if(x<0&&y<0){
			System.out.print(3);			
		}
		else if(x>0&&y<0){
			System.out.print(4);			
		}
	}

}