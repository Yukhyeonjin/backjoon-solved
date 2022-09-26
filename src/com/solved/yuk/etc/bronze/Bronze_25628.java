package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_25628 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int bread = Integer.parseInt(input[0]), meat = Integer.parseInt(input[1]),
            burger = bread / 2 > meat ? meat : bread / 2;
        bw.write(burger+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
