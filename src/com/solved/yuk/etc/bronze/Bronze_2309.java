package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arr[] = new int[9], sum = 0;
        for(int i = 0; i < arr.length; i ++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);
        boolean flag = false;
        for(int i = 0; i < arr.length-1; i ++){
            if(flag) break;
            for(int j = i+1; j < arr.length; j++){
                if(sum - arr[i] - arr[j] == 100){
                    arr[i] = arr[j] = -1;
                    flag = true;
                    break;
                }
            }
        }
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] == -1) continue;
            bw.write(arr[i]+"\n");
        }

        bw.flush();
        bw.close();
    }
}
