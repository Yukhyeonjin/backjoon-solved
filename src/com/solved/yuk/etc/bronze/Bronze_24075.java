package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_24075 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]),
            B = Integer.parseInt(input[1]);
        int max = Math.max(A+B,A-B), min = Math.min(A+B, A-B);
        bw.write( max + "\n" + min );

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

