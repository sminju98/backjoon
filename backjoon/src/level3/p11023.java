package level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
public class p11023{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        
        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine(), " ");
         
            System.out.printf("Case #%d: %d\n", i,Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
        }
    }
}
