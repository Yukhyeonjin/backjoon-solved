package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1977 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine()),
            N = Integer.parseInt(br.readLine());
        double m = Math.sqrt(M), n = Math.sqrt(N);
        int min = -1;

        if(m - (int)(m) != 0){
            min = (int)(m) + 1;
        }else min = (int)(m);
        if((int)Math.pow(min,2) >= M && (int)Math.pow(min,2) <= N){
            int sum = (int)Math.pow(min,2), loopNum = 1;
            while (true){
                int num = min+loopNum;
                if((int)Math.pow(num,2) >= M && (int)Math.pow(num,2) <= N){
                    sum += (int)Math.pow(num,2);
                    loopNum++;
                }else break;
            }
            bw.write(sum+"\n"+(int)Math.pow(min,2));
        }else bw.write("-1");


        bw.flush();
        br.close();
        bw.close();
    }
}
