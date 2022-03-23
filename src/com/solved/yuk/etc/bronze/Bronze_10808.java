package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        int arr[] = new int[26];
        for(int i = 0; i < S.length(); i ++){
            arr[(int)S.charAt(i) - 97]++;
        }
        for(int i = 0; i < arr.length; i ++){
            bw.write(arr[i]+" ");
        }

        bw.flush();
        bw.close();
    }
}
