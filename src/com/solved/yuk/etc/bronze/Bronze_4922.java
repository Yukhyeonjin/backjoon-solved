package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_4922 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int sum = 0, cnt = 1;
            int n = Integer.parseInt(br.readLine());    
            if(n == 0) break;
            for(int i = 0; i < n; i++) {
                sum += cnt;
                cnt+=2;
            }
            bw.write(n + " => " + (sum - n + 1) + "\n");
        }


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
