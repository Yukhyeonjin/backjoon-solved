import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_14913 {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int d = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);
        int dn = k - a + d;
        
        if(dn % d == 0 && dn / d >= 1) System.out.println(dn/d);
        else System.out.println("X");
        
        br.close();
    }
}
