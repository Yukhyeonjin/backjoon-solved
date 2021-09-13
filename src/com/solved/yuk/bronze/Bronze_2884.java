package com.solved.yuk.bronze;

import java.io.*;

public class Bronze_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] hourMinute = br.readLine().split(" ");
        int hour = Integer.parseInt(hourMinute[0]);
        int minute = Integer.parseInt(hourMinute[1]);
        hour = minute - 45 < 0 ? (hour - 1 < 0 ? 23 : hour - 1) : hour;
        minute = minute - 45 < 0 ? 60 - (45 - minute) : minute - 45;
        bw.write(hour + " " + minute);

        bw.flush();
        bw.close();
    }
}
