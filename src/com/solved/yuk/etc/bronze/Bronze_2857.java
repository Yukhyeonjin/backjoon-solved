package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2857 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input; boolean flag = false;
        for(int i = 0; i < 5; i ++){
            input = br.readLine();
            for(int j = 0; j < input.length()-2; j ++){
                if(input.charAt(j) == 'F' && input.charAt(j+1) == 'B' && input.charAt(j+2) == 'I') {
                    bw.write((i+1) + " ");
                    flag = true;
                    break;
                }
            }
        }
        if(!flag) bw.write("HE GOT AWAY!");

        bw.flush();
        br.close();
        bw.close();
    }
}
