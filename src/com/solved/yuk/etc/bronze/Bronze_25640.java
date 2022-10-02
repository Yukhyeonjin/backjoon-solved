package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_25640 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String mbti = br.readLine();
        int n = Integer.parseInt(br.readLine()), count = 0;
        for(int i = 0; i < n; i ++){
            if(mbti.equals(br.readLine())) count++;
        }
        bw.write(count+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
