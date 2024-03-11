package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31561 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        // 12 ~ 6 : 1분침당 0.5분
        // 6 ~ 12 : 1분침당 1.5분
        double result = 0;
        if(M <= 30) result = M / 2.0;
        else result = 15 + (M-30)*1.5;
        bw.write(result+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
