package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int strLen = input.length(), div = strLen / 10, rest = strLen % 10;
        for(int i = 0; i <= div; i++){
            if(i == div && rest != 0){
                bw.write(input.substring(i*10, (i*10)+rest));
            }else if(i == div) break;
            else{
                bw.write(input.substring(i*10, (i*10)+10)+"\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
