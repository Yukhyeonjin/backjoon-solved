package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_14065 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double galon = 3.785411784,
               mile = 1.609344,
               x = Double.parseDouble(br.readLine());
        bw.write(100/(mile/galon*x)+"");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
