package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_25870 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arr[] = new int[26];
        String input = br.readLine();
        for (int i = 0; i < input.length(); i++){
            arr[(int)input.charAt(i) - (int)('a')]++;
        }
        int temp = -1;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] != 0) {
                if(arr[i] % 2  != temp && temp != -1) {
                    temp = 2;
                    break;
                }
                else temp = arr[i] % 2;
            }
        }
        bw.write(temp+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
