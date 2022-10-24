package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_25858 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]), d = Integer.parseInt(input[1]);
        int arr[] = new int[n], sum = 0;
        for(int i = 0; i < n; i ++){
            arr[i] = Integer.parseInt(br.readLine());
            sum+=arr[i];
        }
        for(int i = 0; i < n; i ++){
            bw.write((int)(d*((double)arr[i]/sum))+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
