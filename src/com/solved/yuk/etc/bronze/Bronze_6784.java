package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_6784 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String arr[] = new String[N];
        for (int i = 0; i < N; i ++){
            arr[i] = br.readLine();
        }
        int count = 0;
        for (int i = 0; i < N; i ++){
            if(arr[i].equals(br.readLine())) count++;
        }
        bw.write(count+"");

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }


}

