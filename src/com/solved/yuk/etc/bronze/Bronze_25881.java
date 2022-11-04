package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_25881 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");

        int defaultPer = Integer.parseInt(input[0]),
            overPer =  Integer.parseInt(input[1]),
            N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i ++){
            int kw = Integer.parseInt(br.readLine()), sum = 0;
            if(kw > 1000){
                sum = (1000*defaultPer) + ((kw-1000)*overPer);
            }
            else {
                sum += kw*defaultPer;
            }
            bw.write(kw + " " + sum+"\n");
        }


        bw.flush();
        br.close();
        bw.close();
    }
}
