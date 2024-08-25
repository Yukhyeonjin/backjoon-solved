package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_17530 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int carlos = Integer.parseInt(br.readLine());

        String isElected = "S";
        for (int i = 0; i < N-1; i++){
            int theother = Integer.parseInt(br.readLine());
            if (theother > carlos) isElected = "N";
        }

        bw.write(isElected);

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
