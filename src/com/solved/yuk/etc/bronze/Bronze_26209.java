package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_26209 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" "), msg = "S";

        for(int i = 0; i < input.length; i ++){
            if(!"1".equals(input[i]) && !"0".equals(input[i])) {
                msg = "F";
                break;
            }
        }
        bw.write(msg);


        bw.flush();
        br.close();
        bw.close();
    }
}

