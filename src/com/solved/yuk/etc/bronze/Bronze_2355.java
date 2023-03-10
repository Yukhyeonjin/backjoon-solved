package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2355 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        long A = Long.parseLong(input[0]),
             B = Long.parseLong(input[1]);
        if(B > A) {
            long temp = B;
            B = A;
            A = temp;
        }

        bw.write(((A+B) * (A-B+1) / 2) + "");

        bw.flush();
        br.close();
        bw.close();
    }
}
