package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_11586 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String arr[] = new String[N];
        for(int i = 0; i < N; i ++){
            arr[i] = br.readLine();
        }
        int K = Integer.parseInt(br.readLine());
        if(K == 1){
            for(int i = 0; i < N; i ++){
                bw.write(arr[i]+"\n");
            }
        }
        else if (K == 2){
            for(int i = 0; i < N; i ++){
                for(int j = arr[i].length()-1; j >= 0; j --){
                    bw.write(arr[i].charAt(j));
                }
                bw.newLine();
            }
        }
        else if (K == 3){
            for(int i = arr.length - 1; i >= 0; i --){
                bw.write(arr[i]+"\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
