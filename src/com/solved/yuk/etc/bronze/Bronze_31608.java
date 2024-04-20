package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31608 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        String T = br.readLine();
        int cnt = 0;
        for (int i = 0; i < N; i++){
            if(S.charAt(i) == T.charAt(i)) cnt++;
        }
        bw.write(cnt+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
