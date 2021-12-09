package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5575 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input;
        for(int i = 0; i < 3; i ++){
            input = br.readLine().split(" ");
            int hour = Integer.parseInt(input[3]) - Integer.parseInt(input[0]),
                    min  = Integer.parseInt(input[4]) - Integer.parseInt(input[1]),
                    sec  = Integer.parseInt(input[5]) - Integer.parseInt(input[2]);
            if(sec < 0){
                min--;
                sec = 60 + sec;
            }
            if(min < 0){
                hour--;
                min = 60 + min;
            }
            bw.write(hour + " " + min + " " + sec + "\n");
        }

        bw.flush();
        bw.close();
    }
}
