package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_14545 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int P = Integer.parseInt(br.readLine());
        for (int i = 0; i < P; i++) {
            int l = Integer.parseInt(br.readLine());
            int result = 0;
            for(int j = 1; j <= l; j++){
                result += j*j;
            }
            bw.write(result+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}
