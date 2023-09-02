package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_11179 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String binaryString = Integer.toBinaryString(N);

        StringBuffer sb = new StringBuffer(binaryString);
        int result = Integer.parseInt(sb.reverse().toString(), 2);
        bw.write(result+"");



        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
