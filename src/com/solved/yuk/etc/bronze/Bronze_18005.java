package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_18005 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        if (input % 2 == 1){
            bw.write("0");
        }else {
            if((1+input) % 2 == 1 && (input/2)%2==1){
                bw.write("1");
            }else {
                bw.write("2");
            }
        }

        bw.flush();
        bw.close();
    }
}
