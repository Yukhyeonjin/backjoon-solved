package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_15784 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]),
            a = Integer.parseInt(input[1]),
            b = Integer.parseInt(input[2]),
            arr[][] = new int[n][n];
        for(int i = 0; i < n; i ++){
            input = br.readLine().split(" ");
            for(int j = 0; j < n; j ++) {
                arr[i][j] = Integer.parseInt(input[j]);
            }
        }
        String result = "HAPPY";
        for(int i = 0; i < n; i ++){
            if(arr[a-1][b-1] < arr[a-1][i]) {
                result = "ANGRY";
                break;
            }
            if(arr[a-1][b-1] < arr[i][b-1]){
                result = "ANGRY";
                break;
            }
        }
        bw.write(result);



        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

