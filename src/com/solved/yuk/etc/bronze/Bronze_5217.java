package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N;  i++){
            int num = Integer.parseInt(br.readLine());
            bw.write("Pairs for "+num+":");
            for(int j = 1; j <= num/2;  j++){
                if(j == num/2 && j * 2 == num) break;
                if(j != 1) bw.write(",");
                bw.write(" " + j + " " + (num-j));
            }
            bw.newLine();
        }


        bw.flush();
        br.close();
        bw.close();
    }
}
