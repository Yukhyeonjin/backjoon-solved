package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_6887 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()), max = 0;
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(i*i <= n) {
                max = Math.max(i, max);
            }
        }
        bw.write("The largest square has side length " + max + ".");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
