package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10039 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        int num;
        for(int i = 0; i < 5; i ++){
            num = Integer.parseInt(br.readLine());
            num = num < 40 ? 40 : num;
            sum += num;
        }
        bw.write(sum/5+"");

        bw.flush();
        bw.close();

    }
}
