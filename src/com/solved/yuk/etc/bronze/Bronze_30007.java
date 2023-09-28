package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30007 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), A,B,X;
        String input[];
        for(int i = 0; i < N; i++){
            input = br.readLine().split(" ");
            A = Integer.parseInt(input[0]);
            B = Integer.parseInt(input[1]);
            X = Integer.parseInt(input[2]);
            bw.write( A*(X-1)+B+"\n" );
        }



        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
