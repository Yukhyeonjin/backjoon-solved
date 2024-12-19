import java.util.Arrays;
import java.util.Collections;
import java.io.*;

public class Bronze_5949 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split("");
        reverse(input);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
             if (i != 0 && i % 3 == 0) sb.append(",");
            sb.append(input[i]);
        }
        bw.write(sb.reverse().toString());

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }

    static void reverse(String[] array) {
       Collections.reverse(Arrays.asList(array));
   }
}
