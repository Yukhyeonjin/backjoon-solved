package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1408 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(":");
        int nowHour = Integer.parseInt(input[0]),
            nowMin  = Integer.parseInt(input[1]),
            nowSec  = Integer.parseInt(input[2]);
        input = br.readLine().split(":");
        int startHour = Integer.parseInt(input[0]),
            startMin  = Integer.parseInt(input[1]),
            startSec  = Integer.parseInt(input[2]);
        int restSec = startSec - nowSec, restMin = startMin - nowMin, restHour = startHour - nowHour;
        if(restSec < 0) {
            restMin--;
            restSec = 60+restSec;
        }
        if(restMin < 0) {
            restHour--;
            restMin = 60+restMin;
        }
        if(restHour < 0){
            restHour+=24;
        }
        bw.write(String.format("%02d:%02d:%02d",restHour,restMin,restSec));

        bw.flush();
        br.close();
        bw.close();
    }
}