package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0, arr[] = new int[5];
        for(int i = 0 ; i < 5; i ++){
            int number = Integer.parseInt(br.readLine());
            arr[i] = number;
            sum+=number;
        }
        Arrays.sort(arr);
        int avg = sum/5;
        bw.write(avg+"\n"+arr[2]);

        bw.flush();
        br.close();
        bw.close();
    }
}
