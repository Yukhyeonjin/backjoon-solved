package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_15633 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()), sum = 0;
        for(int i = 1; i <= n; i ++){
            if(n%i == 0) sum+=i;
        }
        bw.write(sum*5-24+"");

        bw.flush();
        br.close();
        bw.close();
    }
}