package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_18301 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int n1  = Integer.parseInt(input[0]),
            n2  = Integer.parseInt(input[1]),
            n12 = Integer.parseInt(input[2]);
        bw.write((n1+1)*(n2+1)/(n12+1)-1+"");

        bw.flush();
        bw.close();

    }
}
