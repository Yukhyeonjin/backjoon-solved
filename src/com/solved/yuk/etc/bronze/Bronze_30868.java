package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30868 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()), n;
        for(int i = 0; i < T; i ++){
            n = Integer.parseInt(br.readLine());
            if(n >= 5) {
                for(int j = 0; j < n/5; j ++){
                    bw.write("++++ ");
                }    
                n %= 5;
            }
            for(int j = 0; j < n; j ++){
                bw.write("|");
            }    
            bw.newLine();
        }
        
        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
