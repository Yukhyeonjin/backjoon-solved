package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30030 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double B = Double.parseDouble(br.readLine());
        // B = A*1.1
        int A = (int)Math.round(B/1.1);
        bw.write(A+"");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

