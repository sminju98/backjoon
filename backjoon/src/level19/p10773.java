package level19;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class p10773 {
 
	public static int[] stack;
	public static int size = 0;
 
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		int K = Integer.parseInt(br.readLine());
 
		stack = new int[K];
		
		while (K-- > 0) {
			int num = Integer.parseInt(br.readLine());
			if(num!=0)push(num);
			else pop();
			
		}
		int sum =0;
		for(int i=0; i<size;i++) {
			sum+=stack[i];
			
			
		}
		System.out.println(sum);
	}
 
	public static void push(int item) {
		stack[size] = item;
		size++;
	}
	
	public static int pop() {
		if(size == 0) {
			return -1;
		}
		else {
			int res = stack[size - 1];
			stack[size - 1] = 0;
			size--;
			return res;
		}
	}
	
	public static int size() {
		return size;
	}
	
	public static int empty() {
		if(size == 0) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public static int top() {
		if(size == 0) {
			return -1;
		}
		else {
			return stack[size - 1];
		}
	}
	
}
 