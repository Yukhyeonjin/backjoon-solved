package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5565 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = Integer.parseInt(br.readLine());
        for(int i = 0; i < 9; i ++){
            sum -= Integer.parseInt(br.readLine());
        }
        bw.write(sum+"");

        bw.flush();
        bw.close();
    }
}
