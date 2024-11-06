package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32515 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String input[][] = new String[4][N];
        
        for(int i = 0; i < 4; i ++){
            String arr[] = br.readLine().split("");
            for(int j = 0; j < N; j ++){
                input[i][j] = arr[j];
            }            
        }
        boolean flag = true;
        String result = "";
        for(int i = 0; i < N; i ++){
            if(input[0][i].equals(input[2][i])) {
                if(input[1][i].equals(input[3][i])) {
                    result += input[1][i];
                }
                else {
                    flag = false;
                    break;
                }
            }
        }
        if(flag) bw.write(result);
        else bw.write("htg!");

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}
