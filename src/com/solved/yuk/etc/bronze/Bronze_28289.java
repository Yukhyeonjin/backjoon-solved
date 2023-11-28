package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_28289 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int P = Integer.parseInt(br.readLine()), G, C, N;
        int sw = 0, im = 0, ai = 0, etc = 0;
        String[] input;
        for (int i = 0; i < P; i++) {
            input = br.readLine().split(" ");
            G = Integer.parseInt(input[0]);
            C = Integer.parseInt(input[1]);
            N = Integer.parseInt(input[2]);
            if(G == 1) etc++;
            else if (C == 1 || C == 2) sw++;
            else if (C == 3) im++;
            else if (C == 4) ai++;
        }
        bw.write(sw+"\n"+im+"\n"+ai+"\n"+etc);


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
