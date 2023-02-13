package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_11320 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i ++){
            String input[] = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]),
                B = Integer.parseInt(input[1]);
            bw.write((A/B) * (A/B) +"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
