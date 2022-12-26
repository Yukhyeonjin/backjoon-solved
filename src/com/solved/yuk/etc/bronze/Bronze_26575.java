package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_26575 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i ++){
            String input[] = br.readLine().split(" ");
            double x = Double.parseDouble(input[0]),
                   y = Double.parseDouble(input[1]),
                   z = Double.parseDouble(input[2]);
            bw.write("$"+String.format("%.2f",x*y*z)+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}