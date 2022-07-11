package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        if(N == 1) {
            int num = Integer.parseInt(br.readLine());
            bw.write(num*num + "");
        }else {
            String input[] = br.readLine().split(" ");
            int arr[] = new int[N];
            for(int i = 0; i < N; i ++){
                arr[i] = Integer.parseInt(input[i]);
            }
            Arrays.sort(arr);
            bw.write(arr[0]*arr[N-1]+"");
        }


        bw.flush();
        br.close();
        bw.close();
    }
}
