package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_23235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 0;
        while (true) {
            String input[] = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            if (N == 0) {
                break;
            }
            cnt++;
            bw.write("Case " +cnt+": Sorting... done!\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
