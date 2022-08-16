package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2083 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while (!"# 0 0".equals(input = br.readLine())){
            String rugby[] = input.split(" ");
            if(Integer.parseInt(rugby[1]) > 17 || Integer.parseInt(rugby[2]) >= 80){
                bw.write(rugby[0] + " Senior\n");
            }else {
                bw.write(rugby[0] + " Junior\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
