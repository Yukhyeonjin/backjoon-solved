package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_7510 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i ++){
            String input[] = br.readLine().split(" ");
            int arr[] = new int[3];
            arr[0] = Integer.parseInt(input[0]);
            arr[1] = Integer.parseInt(input[1]);
            arr[2] = Integer.parseInt(input[2]);
            Arrays.sort(arr);
            bw.write("Scenario #"+(i+1)+":\n");
            if(Math.pow(arr[0],2) + Math.pow(arr[1],2) == Math.pow(arr[2],2)){
                bw.write("yes\n");
            }
            else {
                bw.write("no\n");
            }
            bw.newLine();
        }


        bw.flush();
        br.close();
        bw.close();
    }
}

