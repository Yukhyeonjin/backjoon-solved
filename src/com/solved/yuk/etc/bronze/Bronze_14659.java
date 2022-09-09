package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_14659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), count = 0, max = 0, arr[] = new int[N];
        String input[] = br.readLine().split(" ");
        for (int i = 0; i < N; i ++){
            arr[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < N-1; i ++){
            int arrow = arr[i];
            count = 0;
            for(int j = i+1; j < N; j ++){
                int target = arr[j];
                if(arrow> target) count++;
                else break;
            }
            max = Math.max(count, max);
        }
        bw.write(max+"");


        bw.flush();
        br.close();
        bw.close();
    }
}
