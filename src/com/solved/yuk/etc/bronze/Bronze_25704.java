package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_25704 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), P = Integer.parseInt(br.readLine()), min = 500001;
        if(N < 5){
            bw.write(P+"");
        }
        else {
            if(N >= 5){
                min = Math.min(min, P-500);
            }
            if(N >= 10){
                min = Math.min(min, (P * 90/100));
            }
            if(N >= 15){
                min = Math.min(min, P-2000);
            }
            if(N >= 20){
                min = Math.min(min, (P * 75/100));
            }
            bw.write((min < 0 ? 0 : min) +"");
        }


        bw.flush();
        br.close();
        bw.close();
    }
}
