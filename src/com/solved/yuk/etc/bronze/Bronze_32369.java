package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32369 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int A = Integer.parseInt(input[1]);
        int B = Integer.parseInt(input[2]);

        int goodOnion = 1, badOnion = 1;
        for (int i = 1; i <= N; i ++){
            goodOnion += A;
            badOnion += B;
            if(goodOnion < badOnion) {
                int tmp = badOnion;
                badOnion = goodOnion;
                goodOnion = tmp;
            }
            else if(goodOnion == badOnion) badOnion--;
        }
        bw.write(goodOnion + " " + badOnion);



        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}