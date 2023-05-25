package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_3028 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int arr[] = {1,0,0,0};
        for(int i = 0; i < input.length(); i ++){
            char ch = input.charAt(i);
            if(ch == 'A') {
                arr[3] = arr[0];
                arr[0] = arr[1];
                arr[1] = arr[3];
            }
            else if(ch == 'B') {
                arr[3] = arr[1];
                arr[1] = arr[2];
                arr[2] = arr[3];
            }
            else if(ch == 'C') {
                arr[3] = arr[0];
                arr[0] = arr[2];
                arr[2] = arr[3];
            }
        }
        for(int i = 0; i < 3; i ++){
            if(arr[i] == 1) bw.write(i+1+"");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

