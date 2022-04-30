package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1193 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → 1/3 → 1/4 → 2/3 → 3/2 → 4/1
        //  1     2     3     4     5     6     7     8     9     10
        int X = Integer.parseInt(br.readLine()),
           n = 0, cnt = 0;
        while (true){
            n++;
            cnt += n;
            if(cnt >= X){
                if(n%2==0){
                    bw.write((X-cnt+n) + "/" + (cnt-X+1));
                }else {
                    bw.write((cnt-X+1) + "/" + (X-cnt+n));
                }
                break;
            }
        }

        bw.flush();
        bw.close();
    }
}
