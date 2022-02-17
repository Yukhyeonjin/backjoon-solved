package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_2997 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arr[] = new int[3];
        String input[] = br.readLine().split(" ");
        for(int i = 0; i < 3; i ++){
            arr[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);
        int x = arr[1] - arr[0],
            y = arr[2] - arr[1];
        if(x == y){
            if(arr[0] - x < -100) bw.write((arr[2]+x)+"");
            else bw.write((arr[0]-x)+"");
        }
        else if(2*x == y){
            bw.write((arr[1]+x)+"");
        }
        else if(x == 2*y){
            bw.write((arr[0]+y)+"");
        }

        bw.flush();
        bw.close();
    }
}
