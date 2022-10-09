package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_25625 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]), y = Integer.parseInt(input[1]);
        if(x > y){
            bw.write(x+y+"");
        }
        else {
            bw.write(y-x+"");
        }


        bw.flush();
        br.close();
        bw.close();
    }
}
