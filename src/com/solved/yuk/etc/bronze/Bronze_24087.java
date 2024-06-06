package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_24087 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int S = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int pay = 250;

        while (true) {
            if(A >= S) break;
            A+=B;
            pay+=100;
        }
        bw.write(pay+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}