package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_9076 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i ++){
            String input[] = br.readLine().split(" ");
            int arr[] = new int[input.length];
            for(int j = 0; j < input.length; j ++){
                arr[j] = Integer.parseInt(input[j]);
            }
            Arrays.sort(arr);
            int sum = 0;
            if(arr[3] - arr[1] < 4) {
                for(int j = 1; j < 4; j ++){
                    sum += arr[j];
                }
                bw.write(sum+"\n");
            }
            else bw.write("KIN\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
