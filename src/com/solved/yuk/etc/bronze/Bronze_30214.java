package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30214 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        double s1 = Double.parseDouble(input[0]),
               s2 = Double.parseDouble(input[1]);
        if(s2/2.0 <= s1) bw.write("E");
        else bw.write("H");



        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
