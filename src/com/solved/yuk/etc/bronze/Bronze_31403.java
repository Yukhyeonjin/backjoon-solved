package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31403 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        bw.write(A+B-C+"\n");
        bw.write(Integer.parseInt(A +String.valueOf(B))-C+"");


        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws Exception {
        solution();
    }
}
