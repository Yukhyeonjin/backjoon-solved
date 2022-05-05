package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_15921 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        if(N == 0){
            bw.write("divide by zero");
        }else {
            String input[] = br.readLine().split(" ");
            bw.write("1.00");
        }


        bw.flush();
        bw.close();
    }
}
