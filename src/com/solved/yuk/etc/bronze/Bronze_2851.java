package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2851 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0, arr[] = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0; i < 10; i++){
            int num = arr[i];
            if(num + sum == 100) {
                sum = 100;
                break;
            }
            else if(num + sum > 100){
                if(100 - sum < num + sum - 100) break;
                else {
                    sum+=num;
                    break;
                }
            }
            else sum+=num;
        }
        bw.write(sum+"");

        bw.flush();
        br.close();
        bw.close();
    }
}