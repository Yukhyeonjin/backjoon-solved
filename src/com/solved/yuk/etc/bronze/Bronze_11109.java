package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_11109 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()), d, n, s, p;
        String[] input;
        for(int i = 0; i < T; i ++){
            input = br.readLine().split(" ");
            d = Integer.parseInt(input[0]);
            n = Integer.parseInt(input[1]);
            s = Integer.parseInt(input[2]);
            p = Integer.parseInt(input[3]);
            int serial =  n * s,
                parallel = d + (n * p);
            if(serial == parallel) bw.write("does not matter\n");
            else if(serial < parallel) bw.write("do not parallelize\n");
            else  bw.write("parallelize\n");

        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

