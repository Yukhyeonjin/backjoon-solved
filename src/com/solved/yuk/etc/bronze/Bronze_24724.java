package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_24724 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 1; i <= T; i ++){
            bw.write("Material Management " + i + "\n");
            bw.write("Classification ---- End!\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

