package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_3053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int R = Integer.parseInt(br.readLine()),
            D = 2*R;
        double PI = Math.PI,
               firstResult = PI*Math.pow(R,2),
               secondResult = D*R;
        bw.write(firstResult+"\n"+secondResult);

        bw.flush();
        bw.close();
    }
}
