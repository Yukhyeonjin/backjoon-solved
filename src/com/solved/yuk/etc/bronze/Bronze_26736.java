package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_26736 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int A = 0, B = 0;
        for(int i = 0; i < input.length(); i ++){
            if(input.charAt(i) == 'A') A++;
            else if (input.charAt(i) == 'B') B++;
        }
        bw.write(A + " : " + B);

        bw.flush();
        bw.close();
        br.close();
    }

}