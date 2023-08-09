package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_15080 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" : ");
        int startHour = Integer.parseInt(input[0]),
            startMin = Integer.parseInt(input[1]),
            startSec = Integer.parseInt(input[2]);
        input = br.readLine().split(" : ");
        int endHour = Integer.parseInt(input[0]),
            endMin = Integer.parseInt(input[1]),
            endSec= Integer.parseInt(input[2]);
        if(startHour > endHour) endHour+=24;
        int resultSec = 0;
        if(startSec > endSec) {
            endMin--;
            resultSec += (60 + endSec - startSec);
        }
        else {
            resultSec += (endSec - startSec);
        }
        if(startMin > endMin) {
            endHour--;
            resultSec += (60*(60 + endMin - startMin));
        }
        else {
            resultSec += (60*(endMin - startMin));
        }
        if(startHour > endHour) {
            resultSec += (60*(60*(24 + endHour - startHour)));
        }
        else {
            resultSec += (60*(60*(endHour - startHour)));
        }
        bw.write(resultSec+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

