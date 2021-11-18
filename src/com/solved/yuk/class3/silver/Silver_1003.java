package com.solved.yuk.class3.silver;

import java.io.*;

public class Silver_1003 {
    public static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class3
        int T = Integer.parseInt(br.readLine()), N;
        makeZeroOneArr();
        for(int i = 0; i < T; i ++){
            N = Integer.parseInt(br.readLine());
            bw.write(arr[N][0] + " " + arr[N][1]+"\n");
        }
        bw.flush();
        bw.close();
    }
    public static void makeZeroOneArr(){
        arr = new int[41][2]; //arr[0][0] arr[1][0] arr[2][0]
        arr[0][0] = 1; arr[0][1] = 0;
        arr[1][0] = 0; arr[1][1] = 1;
        arr[2][0] = 1; arr[2][1] = 1;
        for(int i = 3; i <= 40; i ++){
            arr[i][0] = arr[i-1][0]+arr[i-2][0];
            arr[i][1] = arr[i-1][1]+arr[i-2][1];
        }
    }
}
