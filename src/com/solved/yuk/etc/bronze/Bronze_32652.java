package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32652 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuffer sb = new StringBuffer();
        sb.append("AKARAKA");
        int K = Integer.parseInt(br.readLine());
        for(int i = 1; i < K; i ++){
            sb.append("RAKA");
        }
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}
