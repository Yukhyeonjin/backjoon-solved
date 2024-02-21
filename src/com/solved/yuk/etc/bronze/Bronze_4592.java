package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_4592 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while (!"0".equals(input = br.readLine())){
            String arr[] = input.split(" ");
            int N = Integer.parseInt(arr[0]);
            boolean flag[] = new boolean[100];
            bw.write(arr[1]+" ");
            for (int i = 2; i <= N; i ++){
                if(arr[i-1].equals(arr[i])) continue;
                else bw.write(arr[i]+" ");
            }
            bw.write("$\n");
        }


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}