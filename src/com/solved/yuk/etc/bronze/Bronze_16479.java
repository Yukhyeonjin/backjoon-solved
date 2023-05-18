package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_16479 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int K = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int D1 = Integer.parseInt(input[0]), D2 = Integer.parseInt(input[1]);
        double result = K*K - (((D1 - D2) / 2.0)* ((D1 - D2) / 2.0));
        bw.write(result+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

