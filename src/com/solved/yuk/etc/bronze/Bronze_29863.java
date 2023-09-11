package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_29863 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int fromHour = Integer.parseInt(br.readLine()),
            toHour = Integer.parseInt(br.readLine()), sleepHour = 0;
        if(fromHour > toHour) sleepHour = (24+toHour) - fromHour;
        else sleepHour = toHour - fromHour;
        bw.write(sleepHour+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

