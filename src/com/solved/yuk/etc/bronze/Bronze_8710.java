package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_8710 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int k = Integer.parseInt(input[0]),
            w = Integer.parseInt(input[1]),
            m = Integer.parseInt(input[2]);
        int result = (w - k) % m != 0 ? ((w-k)/m)+1 : (w-k)/m;
        bw.write(result+"");

        bw.flush();
        bw.close();
        br.close();
    }
}