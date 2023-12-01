package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_12833 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]),
            B = Integer.parseInt(input[1]),
            C = Integer.parseInt(input[2]);
        if(C % 2 == 0) bw.write((A^B^B)+"\n");
        else bw.write((A^B)+"\n");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
