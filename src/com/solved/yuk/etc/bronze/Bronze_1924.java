package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Calendar;

public class Bronze_1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Calendar ca = Calendar.getInstance();
        String input[] = br.readLine().split(" ");
        ca.set(2007, Integer.parseInt(input[0])-1, Integer.parseInt(input[1]));

        bw.write(ca.getTime().toString().substring(0,3).toUpperCase()+"");


        bw.flush();
        bw.close();
    }
}
