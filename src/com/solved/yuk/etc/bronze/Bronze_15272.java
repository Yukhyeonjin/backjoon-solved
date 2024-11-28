package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_15272 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        boolean flag = false;
        for(int i = 0; i < input.length()-1; i ++){
            if(input.charAt(i) == 's' && input.charAt(i+1) == 's') flag = true;
        }
        if(flag) bw.write("hiss");
        else bw.write("no hiss");
        


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
