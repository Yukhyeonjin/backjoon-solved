package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_14491 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(Integer.toString(Integer.parseInt(br.readLine()),9)+"");



        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws Exception {
        solution();
    }
}
