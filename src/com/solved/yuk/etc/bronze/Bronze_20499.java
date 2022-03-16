package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_20499 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split("/");
        int K = Integer.parseInt(input[0]),
            D = Integer.parseInt(input[1]),
            A = Integer.parseInt(input[2]);
        if(K + A < D || D == 0) bw.write("hasu");
        else bw.write("gosu");

        bw.flush();
        bw.close();
    }
}
