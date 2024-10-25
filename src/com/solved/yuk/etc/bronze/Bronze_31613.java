package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31613 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        while (true) {
            int r = X % 3;
            if(r == 0) X+=1;
            else if(r == 1) X*=2;
            else if(r == 2) X*=3;
            cnt++;
            if(X >= N) break;
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