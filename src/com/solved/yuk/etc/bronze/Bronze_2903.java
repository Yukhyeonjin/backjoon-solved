package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()), arr[] = new int[16], powNum = 9, plusNum = 4;
        // 9 25 81
        // 3  5  9
        arr[0] = 4; arr[1] = 9; arr[2] = 25;
        for(int i = 3; i <= N; i ++){
            arr[i] = powNum*powNum;
            plusNum *= 2;
            powNum  += plusNum;
        }
        bw.write(arr[N]+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
