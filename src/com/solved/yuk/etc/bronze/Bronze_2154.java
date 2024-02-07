package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2154 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++){
            sb.append(i);
        }
        bw.write(sb.indexOf(String.valueOf(N))+1+"");

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws Exception {
        solution();
    }
}
