package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class p27866 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		
		for(int alp = 'a';alp<'z';alp++) {
			System.out.print(S.indexOf(alp));
			System.out.print(' ');
			
		}
		System.out.print(S.indexOf('z'));
		
	}

}
