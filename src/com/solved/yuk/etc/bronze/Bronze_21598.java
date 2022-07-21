package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_21598 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = N-1; i >= 0; i--){
            bw.write("SciComLove\n");
        }


        bw.flush();
        br.close();
        bw.close();
    }
}