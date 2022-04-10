package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_2010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), max = 0, arr[] = new int[N], sum=0;
        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }
        Arrays.sort(arr);
        for(int i = 0; i < N; i++){
            if(i == N -1) sum+= arr[i];
            else sum+= (arr[i]-1);
        }
        bw.write(sum+"");


        bw.flush();
        bw.close();
    }
}
