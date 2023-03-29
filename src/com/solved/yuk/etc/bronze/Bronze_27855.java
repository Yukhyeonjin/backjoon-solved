package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_27855 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input;
        int A = 0, B = 0;
        for(int i = 0; i < 2; i ++){
            input = br.readLine().split(" ");
            if(i == 0){
                A = (Integer.parseInt(input[0]) * 3) + Integer.parseInt(input[1]);
            } else {
                B = (Integer.parseInt(input[0]) * 3) + Integer.parseInt(input[1]);
            }
        }
        if( A > B ) bw.write("1 " + (A-B));
        else if( B > A) bw.write("2 " + (B-A));
        else  bw.write("NO SCORE");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

