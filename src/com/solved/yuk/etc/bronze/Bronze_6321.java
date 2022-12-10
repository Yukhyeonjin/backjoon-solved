package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_6321 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i ++){
            String input = br.readLine();
            bw.write("String #" +(i+1)+"\n");
            for(int j = 0; j < input.length(); j ++){
                char tmp = input.charAt(j);
                tmp = (int)tmp + 1 != (char)91 ? (char)((int)tmp+1) : (char)65;
                bw.write(String.valueOf(tmp));
            }
            bw.write("\n\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}