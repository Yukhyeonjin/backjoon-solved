package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        for(int i = 0; i < input.length(); i ++){
            char c = input.charAt(i);
            if(c >= 'a' && c <= 'z'){
                bw.write(String.valueOf(c).toUpperCase());
            }else {
                bw.write(String.valueOf(c).toLowerCase());
            }
        }



        bw.flush();
        bw.close();
    }
}
