package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_9838 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        for (int i = 0; i < n; i ++){
            arr[Integer.parseInt(br.readLine()) -1] = i+1;
        }
        for (int i = 0; i < n; i ++){
            bw.write(arr[i]+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}