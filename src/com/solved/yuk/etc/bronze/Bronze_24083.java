package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_24083 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine()), B = Integer.parseInt(br.readLine());
        A += B;
        A %= 12;
        bw.write((A == 0 ? 12 : A) +"");


        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws Exception {
        solution();
    }
}
