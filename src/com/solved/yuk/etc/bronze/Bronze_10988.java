package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        boolean flag = true;
        for(int i = 0; i < input.length()/2; i++){
            if(!flag) break;
            if(input.charAt(i) != input.charAt(input.length()-1-i)) flag = false;
        }
        bw.write((flag ? 1 : 0) + "");

        bw.flush();
        bw.close();
    }
}
