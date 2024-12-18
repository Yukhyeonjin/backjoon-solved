package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_15354 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String arr[] = new String[N];
        for (int i = 0; i < N; i ++) {
            arr[i] = br.readLine();
        }

        int cnt=1;
        for (int i = 1; i < N; i ++) {
            if(!arr[i].equals(arr[i-1])) cnt++;
        }
        bw.write(cnt+1+"");
        

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
