package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32025 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int W = Integer.parseInt(br.readLine());
        if(N > W) {
            bw.write((int)(W/2.0*100)+"");
        }
        else {
            bw.write((int)(N/2.0*100)+"");
        }

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }


}

