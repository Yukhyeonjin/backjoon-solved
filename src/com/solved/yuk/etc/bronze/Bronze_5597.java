package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arr[] = new int[31];
        for(int i = 0; i < 28; i ++){
            arr[Integer.parseInt(br.readLine())] = 1;
        }
        for(int i = 1; i <= 30; i ++){
            if(arr[i] == 0) bw.write(i+"\n");
        }

        bw.flush();
        bw.close();
    }
}
