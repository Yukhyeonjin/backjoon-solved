package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_9455 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i ++){
            String input[] = br.readLine().split(" ");
            int m = Integer.parseInt(input[0]),
                n = Integer.parseInt(input[1]);
            int arr[][] = new int[m][n];
            for(int j = 0; j < m; j ++){
                input = br.readLine().split(" ");
                for(int k = 0; k < n; k ++){
                    arr[j][k] = Integer.parseInt(input[k]);
                }
            }
            int count = countMove(arr,m,n);
            bw.write(count+"\n");

        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static int countMove (int arr[][], int m, int n){
        int count = 0;
        for(int i = 0; i < n; i ++){
            for(int j = m-1; j >= 1; j --){
                if(arr[j][i] == 0){
                    for(int k = j-1; k >= 0; k --){
                        if(arr[k][i] == 1){
                            count += (j-k);
                            arr[j][i] = 1;
                            arr[k][i] = 0;
                            break;
                        }
                    }
                }
            }
        }
        return count;
    }
}