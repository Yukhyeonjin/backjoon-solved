package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31663 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[45];
        int[] cnt = new int[45];
        for(int i = 0; i < N; i++){
            String input = br.readLine();
            for(int j = 0; j < input.length(); j++){
                arr[j] += (int)input.charAt(j);
                cnt[j]++;
            }
        }
        for(int i = 0; i < 45; i++){
            if(cnt[i] == 0) break;
            bw.write((char)(arr[i]/cnt[i]));
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
