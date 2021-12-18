package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()),
            F = Integer.parseInt(br.readLine());
        String output;
        int changeN = (N / 100) * 100;
        int count = 0;
        while (changeN%F != 0){
            count++;
            changeN++;
        }
        if(count < 10) output = "0" + Integer.toString(count);
        else output = Integer.toString(count);
        bw.write(output);

        bw.flush();
        bw.close();

    }
}
