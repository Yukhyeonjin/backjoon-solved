package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_1551 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]), K = Integer.parseInt(input[1]);

        input = br.readLine().split(",");
        int arr[] = new int[N];
        for(int i = 0; i < N; i ++){
            arr[i] = Integer.parseInt(input[i]);
        }
        for(int i = 1; i <= K; i ++){
            int conArr[] = new int[N-i];
            for(int j = 0; j < conArr.length; j ++){
                conArr[j] = arr[j+1] - arr[j];
            }
            arr = new int[N-i];
            arr = Arrays.copyOf(conArr,arr.length);
        }
        for(int i = 0; i < arr.length; i ++){
            bw.write(arr[i]+(i != arr.length -1? "," : ""));
        }



        bw.flush();
        br.close();
        bw.close();
    }
}

