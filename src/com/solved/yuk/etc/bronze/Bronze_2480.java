package com.solved.yuk.etc.bronze;


import java.io.*;

public class Bronze_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]),
            B = Integer.parseInt(input[1]),
            C = Integer.parseInt(input[2]);
        int max = Math.max(A, Math.max(B, C));
        if (A == B && B == C) {
            bw.write(Integer.toString( 10000+(A*1000) ));
        } else if (A == B) {
            bw.write(Integer.toString( 1000+(A*100) ));
        } else if (B == C) {
            bw.write(Integer.toString( 1000+(B*100) ));
        } else if (A == C) {
            bw.write(Integer.toString( 1000+(C*100) ));
        } else {
            bw.write(Integer.toString( max*100 ));
        }


        bw.flush();
        bw.close();

    }
}
