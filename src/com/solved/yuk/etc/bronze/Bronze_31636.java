package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31636 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), oCnt = 0;
        String input = br.readLine();
        for (int i = 0; i < N; i ++){
            if(input.charAt(i) == 'o') oCnt++;
            else oCnt = 0;

            if (oCnt >= 3) break;
        }
        bw.write(oCnt >= 3 ? "Yes" : "No");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
