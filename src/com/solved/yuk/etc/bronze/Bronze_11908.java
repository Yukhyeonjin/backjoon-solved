package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_11908 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 앞 : 숫자, 뒤 : 동물
        int n = Integer.parseInt(br.readLine()), card[] = new int[n];
        String input[] = br.readLine().split(" ");
        for(int i = 0; i < n; i ++){
            card[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(card);

        int sum = 0;
        for(int i = 0; i < n-1; i ++){
            sum += card[i];
        }
        bw.write(sum+"");



        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}