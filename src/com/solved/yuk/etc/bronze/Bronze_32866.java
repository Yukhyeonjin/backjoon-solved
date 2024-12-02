import java.io.*;

public class Bronze_32866 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double N = Double.parseDouble(br.readLine());
        double X = Double.parseDouble(br.readLine());
        double now = N*((100-X)/100);
        double result = 100*(N-now)/now;
        bw.write(result+"");
        

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
