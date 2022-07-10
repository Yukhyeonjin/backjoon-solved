package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), num = 2;

        while (N != 1 && true){
            if(N == num){
                bw.write(num+"\n");
                break;
            }
            else if(N % num == 0){
                bw.write(num+"\n");
                N = N / num;
                num = 2;
            }else {
                num++;
            }
        }


        bw.flush();
        br.close();
        bw.close();
    }
}
