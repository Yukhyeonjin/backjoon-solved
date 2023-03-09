package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_8320 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N+1];
        arr[1] = 1;
        for(int i = 2; i < N+1; i ++){
            // i개의 정사각형으로 만들 수 있는 직사각형의 최대 개수 : i의 약수의 갯수 / 2
            for(int j = 1; j <= (int)Math.sqrt(i); j ++){
                if(i % j == 0) arr[i]++;
            }
            arr[i] += arr[i-1];
        }
        bw.write(arr[N]+"");


        bw.flush();
        br.close();
        bw.close();
    }
}
