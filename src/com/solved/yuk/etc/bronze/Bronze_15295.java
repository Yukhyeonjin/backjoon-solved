package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_15295 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int P = Integer.parseInt(br.readLine());
        for (int i = 0; i < P; i++){
            String input[] = br.readLine().split(" ");
            int K = Integer.parseInt(input[0]);
            bw.write(K+" ");
            int N = Integer.parseInt(input[1]);
            int sum = N + (N * (N + 1) / 2);
            bw.write(sum+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

