package level06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class p10988 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();


		for (int i = 0; i < word.length()/2; i++) {
			if(word.charAt(i)!=word.charAt(word.length()-1-i)){
				System.out.print(0);
				return;
			}
		} 
		System.out.print(1);

	}
}
