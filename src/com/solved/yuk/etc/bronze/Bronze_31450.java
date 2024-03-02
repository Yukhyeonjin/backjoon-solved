package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31450 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]),
            K = Integer.parseInt(input[1]);
        if(M % K == 0) bw.write("Yes");
        else bw.write("No");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}