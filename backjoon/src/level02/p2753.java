package level02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2753 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new 
				InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		
		if(90<=A&&A<=100)System.out.print("A");
		if(80<=A&&A<90)System.out.print("B");
		if(70<=A&&A<80)System.out.print("C");
		if(60<=A&&A<70)System.out.print("D");
		if(100<A||A<60)System.out.print("F");
	}

}