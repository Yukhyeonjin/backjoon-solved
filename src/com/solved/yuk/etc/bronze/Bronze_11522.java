package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_11522 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int P = Integer.parseInt(br.readLine());
        for (int i = 0 ; i < P; i ++){
            String input[] = br.readLine().split(" ");
            int K = Integer.parseInt(input[0]);
            int N = Integer.parseInt(input[1]);
            int sum = 0;
            for (int j = 1; j <= N; j ++){
                sum+=j;
            }
            bw.write(K + " " + sum);
            sum = 0;
            int odd = 1;
            for (int j = 1; j <= N; j ++){
                sum+=odd;
                odd+=2;
            }
            bw.write(" " + sum);
            sum = 0;
            int even = 2;
            for (int j = 1; j <= N; j ++){
                sum+=even;
                even+=2;
            }
            bw.write(" " + sum);
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
