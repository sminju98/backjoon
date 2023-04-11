package level13;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class p1181 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		List<String> list = new ArrayList<>();

		
		for(int i=0;i<N;i++) {
			list.add(br.readLine());
					
		}
		

        Set<String> set = new HashSet<String>(list);
        // Set을 List로 변경
        List<String> newList =new ArrayList<String>(set);
        
        Comparator<String> c = new Comparator<String>() {
        	public int compare(String s1, String s2) {
        		return Integer.compare(s1.length(), s2.length());
        	}
        };

        Collections.sort(newList);
        
        

        Collections.sort(newList, c);
        
        
		
		for(int i=0;i<newList.size();i++) {
			System.out.println(newList.get(i));
			
		}
	}


}