package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30156 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i ++) {
            String input[] = br.readLine().split("");
            int aCnt = 0, bCnt = 0;
            for (int j = 0; j < input.length; j ++) {
                if("a".equals(input[j])) {
                    aCnt++;
                } else {
                    bCnt++;
                }
            }
            bw.write(Math.min(aCnt,bCnt)+"\n");
        }
        

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
