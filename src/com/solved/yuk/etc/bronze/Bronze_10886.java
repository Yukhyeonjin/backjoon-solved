package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10886 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), count = 0;
        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(br.readLine()) == 1) count++;
            else count--;
        }
        if(count > 0) bw.write("Junhee is cute!");
        else bw.write("Junhee is not cute!");

        bw.flush();
        bw.close();
    }
}
