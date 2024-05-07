package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_26731 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int arr[] = new int[26];
        for (int i = 0; i < input.length(); i ++){
            arr[(int)input.charAt(i) - (int)('A')]++;
        }
        for (int i = 0; i < arr.length; i ++){
            if(arr[i] == 0) bw.write((char)(i + (int)'A')+"");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
