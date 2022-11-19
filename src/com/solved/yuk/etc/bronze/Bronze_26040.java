package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_26040 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String A = br.readLine();
        String B[] = br.readLine().split(" ");
        for(int i = 0; i < B.length; i ++){
            A = A.replaceAll(B[i], B[i].toLowerCase());
        }
        bw.write(A);

        bw.flush();
        br.close();
        bw.close();
    }
}
