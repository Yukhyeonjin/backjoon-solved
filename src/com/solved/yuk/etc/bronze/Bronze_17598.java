package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_17598 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tigerCnt = 0, lionCnt = 0;
        for (int i = 0; i < 9; i ++) {
            if(br.readLine().equals("Lion")) lionCnt++;
            else tigerCnt++;
        }
        String result = lionCnt > tigerCnt ? "Lion" : "Tiger";
        bw.write(result);
        
        

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}
