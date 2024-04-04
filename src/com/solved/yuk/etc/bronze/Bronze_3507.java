package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_3507 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int result;
        if(N > 198) result = 0;
        else result = 99 - (N - 99) + 1;
        bw.write(result+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
