package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5612 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()),
            m = Integer.parseInt(br.readLine()), max = m;
        for(int i = 0; i < n; i ++){
            String input[] = br.readLine().split(" ");
            int plus = Integer.parseInt(input[0]),
                minus = Integer.parseInt(input[1]);
             m = m + plus - minus;
             if(m >= 0){
                 max = Math.max(max, m);
             } else {
                 max = 0;
                 break;
             }
        }
        bw.write(max+"");


        bw.flush();
        br.close();
        bw.close();
    }

}