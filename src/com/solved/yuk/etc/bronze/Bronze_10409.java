package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10409 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String input[] = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]), T = Integer.parseInt(input[1]), count = 0;
        input = br.readLine().split(" ");
        for(int i = 0; i < input.length; i ++){
            int runningTime = Integer.parseInt(input[i]);
            if(T >= runningTime) {
                count++;
                T -= runningTime;
            }else break;
        }
        bw.write(count+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
